package j$.util.concurrent;

import j$.sun.misc.DesugarUnsafe;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes5.dex */
public class ConcurrentHashMap extends AbstractMap implements java.util.concurrent.ConcurrentMap, Serializable, ConcurrentMap {
    private static final int ABASE;
    private static final int ASHIFT;
    private static final long BASECOUNT;
    private static final long CELLSBUSY;
    private static final long CELLVALUE;
    static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final long SIZECTL;
    private static final long TRANSFERINDEX;
    private static final DesugarUnsafe U;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;
    private volatile transient CounterCell[] counterCells;
    private transient EntrySetView entrySet;
    private transient KeySetView keySet;
    private volatile transient Node[] nextTable;
    private volatile transient int sizeCtl;
    volatile transient Node[] table;
    private volatile transient int transferIndex;
    private transient ValuesView values;

    static final int spread(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", Segment[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        DesugarUnsafe unsafe = DesugarUnsafe.getUnsafe();
        U = unsafe;
        SIZECTL = unsafe.objectFieldOffset(ConcurrentHashMap.class, "sizeCtl");
        TRANSFERINDEX = unsafe.objectFieldOffset(ConcurrentHashMap.class, "transferIndex");
        BASECOUNT = unsafe.objectFieldOffset(ConcurrentHashMap.class, "baseCount");
        CELLSBUSY = unsafe.objectFieldOffset(ConcurrentHashMap.class, "cellsBusy");
        CELLVALUE = unsafe.objectFieldOffset(CounterCell.class, "value");
        ABASE = unsafe.arrayBaseOffset(Node[].class);
        int arrayIndexScale = unsafe.arrayIndexScale(Node[].class);
        if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        ASHIFT = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class Node implements Map.Entry {
        final int hash;
        final Object key;
        volatile Node next;
        volatile Object val;

        Node(int i, Object obj, Object obj2) {
            this.hash = i;
            this.key = obj;
            this.val = obj2;
        }

        Node(int i, Object obj, Object obj2, Node node) {
            this(i, obj, obj2);
            this.next = node;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        public final String toString() {
            return Helpers.mapEntryToString(this.key, this.val);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        Node find(int i, Object obj) {
            Object obj2;
            if (obj == null) {
                return null;
            }
            Node node = this;
            do {
                if (node.hash == i && ((obj2 = node.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return node;
                }
                node = node.next;
            } while (node != null);
            return null;
        }
    }

    private static final int tableSizeFor(int i) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    static Class comparableClassFor(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int compareComparables(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    static final Node tabAt(Node[] nodeArr, int i) {
        return (Node) U.getObjectAcquire(nodeArr, (i << ASHIFT) + ABASE);
    }

    static final boolean casTabAt(Node[] nodeArr, int i, Node node, Node node2) {
        return U.compareAndSetObject(nodeArr, ABASE + (i << ASHIFT), node, node2);
    }

    static final void setTabAt(Node[] nodeArr, int i, Node node) {
        U.putObjectRelease(nodeArr, (i << ASHIFT) + ABASE, node);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        this(i, 0.75f, 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        double d = (i < i2 ? i2 : i) / f;
        Double.isNaN(d);
        long j = (long) (d + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : tableSizeFor((int) j);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0;
        }
        if (sumCount > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) sumCount;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return sumCount() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return r1.val;
     */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r4.table
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$Node r1 = tabAt(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.val
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.ConcurrentHashMap$Node r5 = r1.find(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.val
        L36:
            return r2
        L37:
            j$.util.concurrent.ConcurrentHashMap$Node r1 = r1.next
            if (r1 == 0) goto L4e
            int r3 = r1.hash
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.key
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.val
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            throw null;
        }
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj2 = advance.val;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Object put(Object obj, Object obj2) {
        return putVal(obj, obj2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        addCount(1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b3, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x009f, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object putVal(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto Lbd
            if (r10 == 0) goto Lbd
            int r1 = r9.hashCode()
            int r1 = spread(r1)
            r2 = 0
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.table
        L10:
            if (r3 == 0) goto Lb7
            int r4 = r3.length
            if (r4 != 0) goto L17
            goto Lb7
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.ConcurrentHashMap$Node r5 = tabAt(r3, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.ConcurrentHashMap$Node r5 = new j$.util.concurrent.ConcurrentHashMap$Node
            r5.<init>(r1, r9, r10)
            boolean r4 = casTabAt(r3, r4, r0, r5)
            if (r4 == 0) goto L10
            goto Lae
        L2d:
            int r6 = r5.hash
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.helpTransfer(r3, r5)
            goto L10
        L37:
            if (r11 == 0) goto L4c
            if (r6 != r1) goto L4c
            java.lang.Object r7 = r5.key
            if (r7 == r9) goto L47
            if (r7 == 0) goto L4c
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L4c
        L47:
            java.lang.Object r7 = r5.val
            if (r7 == 0) goto L4c
            return r7
        L4c:
            monitor-enter(r5)
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            if (r7 != r5) goto La0
            if (r6 < 0) goto L7e
            r2 = 1
            r6 = r5
        L57:
            int r7 = r6.hash     // Catch: java.lang.Throwable -> Lb4
            if (r7 != r1) goto L6e
            java.lang.Object r7 = r6.key     // Catch: java.lang.Throwable -> Lb4
            if (r7 == r9) goto L67
            if (r7 == 0) goto L6e
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto L6e
        L67:
            java.lang.Object r7 = r6.val     // Catch: java.lang.Throwable -> Lb4
            if (r11 != 0) goto La1
            r6.val = r10     // Catch: java.lang.Throwable -> Lb4
            goto La1
        L6e:
            j$.util.concurrent.ConcurrentHashMap$Node r7 = r6.next     // Catch: java.lang.Throwable -> Lb4
            if (r7 != 0) goto L7a
            j$.util.concurrent.ConcurrentHashMap$Node r7 = new j$.util.concurrent.ConcurrentHashMap$Node     // Catch: java.lang.Throwable -> Lb4
            r7.<init>(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            r6.next = r7     // Catch: java.lang.Throwable -> Lb4
            goto La0
        L7a:
            int r2 = r2 + 1
            r6 = r7
            goto L57
        L7e:
            boolean r6 = r5 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto L93
            r2 = 2
            r6 = r5
            j$.util.concurrent.ConcurrentHashMap$TreeBin r6 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r6     // Catch: java.lang.Throwable -> Lb4
            j$.util.concurrent.ConcurrentHashMap$TreeNode r6 = r6.putTreeVal(r1, r9, r10)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto La0
            java.lang.Object r7 = r6.val     // Catch: java.lang.Throwable -> Lb4
            if (r11 != 0) goto La1
            r6.val = r10     // Catch: java.lang.Throwable -> Lb4
            goto La1
        L93:
            boolean r6 = r5 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lb4
            if (r6 != 0) goto L98
            goto La0
        L98:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r10 = "Recursive update"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Lb4
            throw r9     // Catch: java.lang.Throwable -> Lb4
        La0:
            r7 = r0
        La1:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L10
            r9 = 8
            if (r2 < r9) goto Lab
            r8.treeifyBin(r3, r4)
        Lab:
            if (r7 == 0) goto Lae
            return r7
        Lae:
            r9 = 1
            r8.addCount(r9, r2)
            return r0
        Lb4:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lb4
            throw r9
        Lb7:
            j$.util.concurrent.ConcurrentHashMap$Node[] r3 = r8.initTable()
            goto L10
        Lbd:
            goto Lbf
        Lbe:
            throw r0
        Lbf:
            goto Lbe
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.putVal(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(Map map) {
        tryPresize(map.size());
        for (Map.Entry entry : map.entrySet()) {
            putVal(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Object remove(Object obj) {
        return replaceNode(obj, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ae, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object replaceNode(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = spread(r0)
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r12.table
        La:
            r2 = 0
            if (r1 == 0) goto Lc0
            int r3 = r1.length
            if (r3 == 0) goto Lc0
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$Node r4 = tabAt(r1, r3)
            if (r4 != 0) goto L1b
            goto Lc0
        L1b:
            int r5 = r4.hash
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.ConcurrentHashMap$Node[] r1 = r12.helpTransfer(r1, r4)
            goto La
        L25:
            r7 = 0
            monitor-enter(r4)
            j$.util.concurrent.ConcurrentHashMap$Node r8 = tabAt(r1, r3)     // Catch: java.lang.Throwable -> Lbd
            r9 = 1
            if (r8 != r4) goto Laf
            if (r5 < 0) goto L6b
            r7 = r2
            r5 = r4
        L32:
            int r8 = r5.hash     // Catch: java.lang.Throwable -> Lbd
            if (r8 != r0) goto L62
            java.lang.Object r8 = r5.key     // Catch: java.lang.Throwable -> Lbd
            if (r8 == r13) goto L42
            if (r8 == 0) goto L62
            boolean r8 = r13.equals(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r8 == 0) goto L62
        L42:
            java.lang.Object r8 = r5.val     // Catch: java.lang.Throwable -> Lbd
            if (r15 == 0) goto L50
            if (r15 == r8) goto L50
            if (r8 == 0) goto L9f
            boolean r10 = r15.equals(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r10 == 0) goto L9f
        L50:
            if (r14 == 0) goto L55
            r5.val = r14     // Catch: java.lang.Throwable -> Lbd
            goto La0
        L55:
            if (r7 == 0) goto L5c
            j$.util.concurrent.ConcurrentHashMap$Node r3 = r5.next     // Catch: java.lang.Throwable -> Lbd
            r7.next = r3     // Catch: java.lang.Throwable -> Lbd
            goto La0
        L5c:
            j$.util.concurrent.ConcurrentHashMap$Node r5 = r5.next     // Catch: java.lang.Throwable -> Lbd
            setTabAt(r1, r3, r5)     // Catch: java.lang.Throwable -> Lbd
            goto La0
        L62:
            j$.util.concurrent.ConcurrentHashMap$Node r7 = r5.next     // Catch: java.lang.Throwable -> Lbd
            if (r7 != 0) goto L67
            goto L9f
        L67:
            r11 = r7
            r7 = r5
            r5 = r11
            goto L32
        L6b:
            boolean r5 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lbd
            if (r5 == 0) goto La2
            r5 = r4
            j$.util.concurrent.ConcurrentHashMap$TreeBin r5 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r5     // Catch: java.lang.Throwable -> Lbd
            j$.util.concurrent.ConcurrentHashMap$TreeNode r7 = r5.root     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto L9f
            j$.util.concurrent.ConcurrentHashMap$TreeNode r7 = r7.findTreeNode(r0, r13, r2)     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto L9f
            java.lang.Object r8 = r7.val     // Catch: java.lang.Throwable -> Lbd
            if (r15 == 0) goto L8a
            if (r15 == r8) goto L8a
            if (r8 == 0) goto L9f
            boolean r10 = r15.equals(r8)     // Catch: java.lang.Throwable -> Lbd
            if (r10 == 0) goto L9f
        L8a:
            if (r14 == 0) goto L8f
            r7.val = r14     // Catch: java.lang.Throwable -> Lbd
            goto La0
        L8f:
            boolean r7 = r5.removeTreeNode(r7)     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto La0
            j$.util.concurrent.ConcurrentHashMap$TreeNode r5 = r5.first     // Catch: java.lang.Throwable -> Lbd
            j$.util.concurrent.ConcurrentHashMap$Node r5 = untreeify(r5)     // Catch: java.lang.Throwable -> Lbd
            setTabAt(r1, r3, r5)     // Catch: java.lang.Throwable -> Lbd
            goto La0
        L9f:
            r8 = r2
        La0:
            r7 = 1
            goto Lb0
        La2:
            boolean r3 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lbd
            if (r3 != 0) goto La7
            goto Laf
        La7:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r14 = "Recursive update"
            r13.<init>(r14)     // Catch: java.lang.Throwable -> Lbd
            throw r13     // Catch: java.lang.Throwable -> Lbd
        Laf:
            r8 = r2
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbd
            if (r7 == 0) goto La
            if (r8 == 0) goto Lc0
            if (r14 != 0) goto Lbc
            r13 = -1
            r12.addCount(r13, r6)
        Lbc:
            return r8
        Lbd:
            r13 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lbd
            throw r13
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.replaceNode(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void clear() {
        Node tabAt;
        Node node;
        Node[] nodeArr = this.table;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (nodeArr != null && i < nodeArr.length) {
                tabAt = tabAt(nodeArr, i);
                if (tabAt == null) {
                    i++;
                } else {
                    int i2 = tabAt.hash;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (tabAt) {
                        if (tabAt(nodeArr, i) == tabAt) {
                            if (i2 >= 0) {
                                node = tabAt;
                            } else {
                                node = tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null;
                            }
                            while (node != null) {
                                j--;
                                node = node.next;
                            }
                            setTabAt(nodeArr, i, null);
                            i++;
                        }
                    }
                }
            }
            nodeArr = helpTransfer(nodeArr, tabAt);
        }
        if (j != 0) {
            addCount(j, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set keySet() {
        KeySetView keySetView = this.keySet;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.keySet = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection values() {
        ValuesView valuesView = this.values;
        if (valuesView != null) {
            return valuesView;
        }
        ValuesView valuesView2 = new ValuesView(this);
        this.values = valuesView2;
        return valuesView2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set entrySet() {
        EntrySetView entrySetView = this.entrySet;
        if (entrySetView != null) {
            return entrySetView;
        }
        EntrySetView entrySetView2 = new EntrySetView(this);
        this.entrySet = entrySetView2;
        return entrySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        Node[] nodeArr = this.table;
        int i = 0;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                i += advance.val.hashCode() ^ advance.key.hashCode();
            }
        }
        return i;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        Node[] nodeArr = this.table;
        int length = nodeArr == null ? 0 : nodeArr.length;
        Traverser traverser = new Traverser(nodeArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Node advance = traverser.advance();
        if (advance != null) {
            while (true) {
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                sb.append(',');
                sb.append(' ');
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        Node[] nodeArr = this.table;
        int length = nodeArr == null ? 0 : nodeArr.length;
        Traverser traverser = new Traverser(nodeArr, length, 0, length);
        while (true) {
            Node advance = traverser.advance();
            if (advance != null) {
                Object obj3 = advance.val;
                Object obj4 = map.get(advance.key);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    break;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* loaded from: classes5.dex */
    class Segment extends ReentrantLock {
        private static final long serialVersionUID = 2249069246763182397L;
        final float loadFactor;

        Segment(float f) {
            this.loadFactor = f;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 1;
        int i2 = 0;
        while (i < 16) {
            i2++;
            i <<= 1;
        }
        int i3 = 32 - i2;
        int i4 = i - 1;
        Segment[] segmentArr = new Segment[16];
        for (int i5 = 0; i5 < 16; i5++) {
            segmentArr[i5] = new Segment(0.75f);
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", segmentArr);
        putFields.put("segmentShift", i3);
        putFields.put("segmentMask", i4);
        objectOutputStream.writeFields();
        Node[] nodeArr = this.table;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                objectOutputStream.writeObject(advance.key);
                objectOutputStream.writeObject(advance.val);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        boolean z;
        boolean z2;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        Node node = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j3++;
            node = new Node(spread(readObject.hashCode()), readObject, readObject2, node);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        double d = ((float) j3) / 0.75f;
        Double.isNaN(d);
        long j4 = (long) (d + 1.0d);
        int tableSizeFor = j4 >= 1073741824 ? 1073741824 : tableSizeFor((int) j4);
        Node[] nodeArr = new Node[tableSizeFor];
        int i = tableSizeFor - 1;
        while (node != null) {
            Node node2 = node.next;
            int i2 = node.hash;
            int i3 = i2 & i;
            Node tabAt = tabAt(nodeArr, i3);
            if (tabAt == null) {
                z2 = true;
            } else {
                Object obj2 = node.key;
                if (tabAt.hash >= 0) {
                    int i4 = 0;
                    for (Node node3 = tabAt; node3 != null; node3 = node3.next) {
                        if (node3.hash == i2 && ((obj = node3.key) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i4++;
                    }
                    z = true;
                    if (!z || i4 < 8) {
                        z2 = z;
                    } else {
                        j2++;
                        node.next = tabAt;
                        Node node4 = node;
                        TreeNode treeNode = null;
                        TreeNode treeNode2 = null;
                        while (node4 != null) {
                            long j5 = j2;
                            TreeNode treeNode3 = new TreeNode(node4.hash, node4.key, node4.val, null, null);
                            treeNode3.prev = treeNode2;
                            if (treeNode2 == null) {
                                treeNode = treeNode3;
                            } else {
                                treeNode2.next = treeNode3;
                            }
                            node4 = node4.next;
                            treeNode2 = treeNode3;
                            j2 = j5;
                        }
                        setTabAt(nodeArr, i3, new TreeBin(treeNode));
                    }
                } else if (((TreeBin) tabAt).putTreeVal(i2, obj2, node.val) == null) {
                    j2 += j;
                }
                z2 = false;
            }
            j = 1;
            if (z2) {
                j2++;
                node.next = tabAt;
                setTabAt(nodeArr, i3, node);
            }
            node = node2;
        }
        this.table = nodeArr;
        this.sizeCtl = tableSizeFor - (tableSizeFor >>> 2);
        this.baseCount = j2;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        return putVal(obj, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        if (obj != null) {
            return (obj2 == null || replaceNode(obj, null, obj2) == null) ? false : true;
        }
        throw null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return replaceNode(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        return replaceNode(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        if (biConsumer == null) {
            throw null;
        }
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            } else {
                biConsumer.accept(advance.key, advance.val);
            }
        }
    }

    @Override // j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        if (biFunction == null) {
            throw null;
        }
        Node[] nodeArr = this.table;
        if (nodeArr == null) {
            return;
        }
        Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
        while (true) {
            Node advance = traverser.advance();
            if (advance == null) {
                return;
            }
            Object obj = advance.val;
            Object obj2 = advance.key;
            do {
                Object apply = biFunction.apply(obj2, obj);
                if (apply == null) {
                    throw null;
                }
                if (replaceNode(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    boolean removeEntryIf(Predicate predicate) {
        if (predicate == null) {
            throw null;
        }
        Node[] nodeArr = this.table;
        boolean z = false;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && replaceNode(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    boolean removeValueIf(Predicate predicate) {
        if (predicate == null) {
            throw null;
        }
        Node[] nodeArr = this.table;
        boolean z = false;
        if (nodeArr != null) {
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    break;
                }
                Object obj = advance.key;
                Object obj2 = advance.val;
                if (predicate.test(obj2) && replaceNode(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f0, code lost:
    
        if (r5 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f2, code lost:
    
        addCount(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
    
        return r5;
     */
    @Override // j$.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object computeIfAbsent(java.lang.Object r13, j$.util.function.Function r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lb9
            if (r15 == 0) goto Lb9
            int r1 = r14.hashCode()
            int r1 = spread(r1)
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.table
            r3 = 0
            r5 = r0
            r4 = 0
        L12:
            if (r2 == 0) goto Lb3
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb3
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.ConcurrentHashMap$Node r7 = tabAt(r2, r6)
            if (r7 != 0) goto L24
            goto La9
        L24:
            int r8 = r7.hash
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.helpTransfer(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.ConcurrentHashMap$Node r10 = tabAt(r2, r6)     // Catch: java.lang.Throwable -> Lb0
            if (r10 != r7) goto La6
            if (r8 < 0) goto L6c
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.hash     // Catch: java.lang.Throwable -> Lb0
            if (r11 != r1) goto L61
            java.lang.Object r11 = r8.key     // Catch: java.lang.Throwable -> Lb0
            if (r11 == r14) goto L4a
            if (r11 == 0) goto L61
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> Lb0
            if (r11 == 0) goto L61
        L4a:
            java.lang.Object r5 = r8.val     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L55
            r8.val = r5     // Catch: java.lang.Throwable -> Lb0
            goto La6
        L55:
            j$.util.concurrent.ConcurrentHashMap$Node r3 = r8.next     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto L5c
            r10.next = r3     // Catch: java.lang.Throwable -> Lb0
            goto L5f
        L5c:
            setTabAt(r2, r6, r3)     // Catch: java.lang.Throwable -> Lb0
        L5f:
            r3 = -1
            goto La6
        L61:
            j$.util.concurrent.ConcurrentHashMap$Node r10 = r8.next     // Catch: java.lang.Throwable -> Lb0
            if (r10 != 0) goto L66
            goto La6
        L66:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L6c:
            boolean r8 = r7 instanceof j$.util.concurrent.ConcurrentHashMap.TreeBin     // Catch: java.lang.Throwable -> Lb0
            if (r8 == 0) goto L99
            r4 = 2
            r8 = r7
            j$.util.concurrent.ConcurrentHashMap$TreeBin r8 = (j$.util.concurrent.ConcurrentHashMap.TreeBin) r8     // Catch: java.lang.Throwable -> Lb0
            j$.util.concurrent.ConcurrentHashMap$TreeNode r10 = r8.root     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto La6
            j$.util.concurrent.ConcurrentHashMap$TreeNode r10 = r10.findTreeNode(r1, r14, r0)     // Catch: java.lang.Throwable -> Lb0
            if (r10 == 0) goto La6
            java.lang.Object r5 = r10.val     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> Lb0
            if (r5 == 0) goto L89
            r10.val = r5     // Catch: java.lang.Throwable -> Lb0
            goto La6
        L89:
            boolean r3 = r8.removeTreeNode(r10)     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L5f
            j$.util.concurrent.ConcurrentHashMap$TreeNode r3 = r8.first     // Catch: java.lang.Throwable -> Lb0
            j$.util.concurrent.ConcurrentHashMap$Node r3 = untreeify(r3)     // Catch: java.lang.Throwable -> Lb0
            setTabAt(r2, r6, r3)     // Catch: java.lang.Throwable -> Lb0
            goto L5f
        L99:
            boolean r6 = r7 instanceof j$.util.concurrent.ConcurrentHashMap.ReservationNode     // Catch: java.lang.Throwable -> Lb0
            if (r6 != 0) goto L9e
            goto La6
        L9e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> Lb0
            throw r14     // Catch: java.lang.Throwable -> Lb0
        La6:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L12
        La9:
            if (r3 == 0) goto Laf
            long r14 = (long) r3
            r13.addCount(r14, r4)
        Laf:
            return r5
        Lb0:
            r14 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lb0
            throw r14
        Lb3:
            j$.util.concurrent.ConcurrentHashMap$Node[] r2 = r13.initTable()
            goto L12
        Lb9:
            goto Lbb
        Lba:
            throw r0
        Lbb:
            goto Lba
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010b, code lost:
    
        if (r4 == 0) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010d, code lost:
    
        addCount(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0111, code lost:
    
        return r5;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object compute(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d7, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, j$.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    public long mappingCount() {
        long sumCount = sumCount();
        if (sumCount < 0) {
            return 0L;
        }
        return sumCount;
    }

    public static KeySetView newKeySet() {
        return new KeySetView(new ConcurrentHashMap(), Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class ForwardingNode extends Node {
        final Node[] nextTable;

        ForwardingNode(Node[] nodeArr) {
            super(-1, null, null);
            this.nextTable = nodeArr;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i, Object obj) {
            int length;
            Node tabAt;
            Object obj2;
            Node[] nodeArr = this.nextTable;
            loop0: while (obj != null && nodeArr != null && (length = nodeArr.length) != 0 && (tabAt = ConcurrentHashMap.tabAt(nodeArr, (length - 1) & i)) != null) {
                do {
                    int i2 = tabAt.hash;
                    if (i2 == i && ((obj2 = tabAt.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return tabAt;
                    }
                    if (i2 < 0) {
                        if (tabAt instanceof ForwardingNode) {
                            nodeArr = ((ForwardingNode) tabAt).nextTable;
                        } else {
                            return tabAt.find(i, obj);
                        }
                    } else {
                        tabAt = tabAt.next;
                    }
                } while (tabAt != null);
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class ReservationNode extends Node {
        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i, Object obj) {
            return null;
        }

        ReservationNode() {
            super(-3, null, null);
        }
    }

    static final int resizeStamp(int i) {
        return Integer.numberOfLeadingZeros(i) | 32768;
    }

    private final Node[] initTable() {
        while (true) {
            Node[] nodeArr = this.table;
            if (nodeArr != null && nodeArr.length != 0) {
                return nodeArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (U.compareAndSetInt(this, SIZECTL, i, -1)) {
                try {
                    Node[] nodeArr2 = this.table;
                    if (nodeArr2 == null || nodeArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        Node[] nodeArr3 = new Node[i2];
                        this.table = nodeArr3;
                        i = i2 - (i2 >>> 2);
                        nodeArr2 = nodeArr3;
                    }
                    this.sizeCtl = i;
                    return nodeArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r1.compareAndSetLong(r11, r3, r5, r9) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addCount(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.ConcurrentHashMap$CounterCell[] r0 = r11.counterCells
            if (r0 != 0) goto L14
            j$.sun.misc.DesugarUnsafe r1 = j$.util.concurrent.ConcurrentHashMap.U
            long r3 = j$.util.concurrent.ConcurrentHashMap.BASECOUNT
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSetLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L94
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L94
            int r3 = j$.util.concurrent.ThreadLocalRandom.getProbe()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L94
            j$.sun.misc.DesugarUnsafe r3 = j$.util.concurrent.ConcurrentHashMap.U
            long r5 = j$.util.concurrent.ConcurrentHashMap.CELLVALUE
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSetLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L94
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.sumCount()
        L3b:
            if (r14 < 0) goto L93
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r12 = r11.table
            if (r12 == 0) goto L93
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L93
            int r13 = resizeStamp(r13)
            if (r4 >= 0) goto L7b
            int r14 = r4 >>> 16
            if (r14 != r13) goto L93
            int r14 = r13 + 1
            if (r4 == r14) goto L93
            r14 = 65535(0xffff, float:9.1834E-41)
            int r13 = r13 + r14
            if (r4 == r13) goto L93
            j$.util.concurrent.ConcurrentHashMap$Node[] r13 = r11.nextTable
            if (r13 == 0) goto L93
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6a
            goto L93
        L6a:
            j$.sun.misc.DesugarUnsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSetInt(r1, r2, r4, r5)
            if (r14 == 0) goto L8e
            r11.transfer(r12, r13)
            goto L8e
        L7b:
            j$.sun.misc.DesugarUnsafe r0 = j$.util.concurrent.ConcurrentHashMap.U
            long r2 = j$.util.concurrent.ConcurrentHashMap.SIZECTL
            int r13 = r13 << 16
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSetInt(r1, r2, r4, r5)
            if (r13 == 0) goto L8e
            r13 = 0
            r11.transfer(r12, r13)
        L8e:
            long r9 = r11.sumCount()
            goto L3d
        L93:
            return
        L94:
            r11.fullAddCount(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.addCount(long, int):void");
    }

    final Node[] helpTransfer(Node[] nodeArr, Node node) {
        Node[] nodeArr2;
        int i;
        if (nodeArr != null && (node instanceof ForwardingNode) && (nodeArr2 = ((ForwardingNode) node).nextTable) != null) {
            int resizeStamp = resizeStamp(nodeArr.length);
            while (true) {
                if (nodeArr2 != this.nextTable || this.table != nodeArr || (i = this.sizeCtl) >= 0 || (i >>> 16) != resizeStamp || i == resizeStamp + 1 || i == 65535 + resizeStamp || this.transferIndex <= 0) {
                    break;
                }
                if (U.compareAndSetInt(this, SIZECTL, i, i + 1)) {
                    transfer(nodeArr, nodeArr2);
                    break;
                }
            }
            return nodeArr2;
        }
        return this.table;
    }

    private final void tryPresize(int i) {
        int length;
        int tableSizeFor = i >= 536870912 ? 1073741824 : tableSizeFor(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            Node[] nodeArr = this.table;
            if (nodeArr == null || (length = nodeArr.length) == 0) {
                int i3 = i2 > tableSizeFor ? i2 : tableSizeFor;
                if (U.compareAndSetInt(this, SIZECTL, i2, -1)) {
                    try {
                        if (this.table == nodeArr) {
                            this.table = new Node[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i2;
                    }
                } else {
                    continue;
                }
            } else {
                if (tableSizeFor <= i2 || length >= 1073741824) {
                    return;
                }
                if (nodeArr == this.table) {
                    if (U.compareAndSetInt(this, SIZECTL, i2, (resizeStamp(length) << 16) + 2)) {
                        transfer(nodeArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.ConcurrentHashMap$Node] */
    private final void transfer(Node[] nodeArr, Node[] nodeArr2) {
        Node[] nodeArr3;
        int i;
        int i2;
        ForwardingNode forwardingNode;
        ConcurrentHashMap concurrentHashMap;
        int i3;
        Node treeBin;
        Node treeBin2;
        TreeNode treeNode;
        int i4;
        ConcurrentHashMap concurrentHashMap2 = this;
        Node[] nodeArr4 = nodeArr;
        int length = nodeArr4.length;
        int i5 = NCPU;
        int i6 = i5 > 1 ? (length >>> 3) / i5 : length;
        int i7 = i6 < 16 ? 16 : i6;
        if (nodeArr2 == null) {
            try {
                Node[] nodeArr5 = new Node[length << 1];
                concurrentHashMap2.nextTable = nodeArr5;
                concurrentHashMap2.transferIndex = length;
                nodeArr3 = nodeArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            nodeArr3 = nodeArr2;
        }
        int length2 = nodeArr3.length;
        ForwardingNode forwardingNode2 = new ForwardingNode(nodeArr3);
        int i8 = 0;
        int i9 = 0;
        boolean z = true;
        boolean z2 = false;
        while (true) {
            if (z) {
                int i10 = i9 - 1;
                if (i10 >= i8 || z2) {
                    i8 = i8;
                    i9 = i10;
                } else {
                    int i11 = concurrentHashMap2.transferIndex;
                    if (i11 <= 0) {
                        i9 = -1;
                    } else {
                        DesugarUnsafe desugarUnsafe = U;
                        long j = TRANSFERINDEX;
                        int i12 = i11 > i7 ? i11 - i7 : 0;
                        int i13 = i8;
                        if (desugarUnsafe.compareAndSetInt(this, j, i11, i12)) {
                            i9 = i11 - 1;
                            i8 = i12;
                        } else {
                            i8 = i13;
                            i9 = i10;
                        }
                    }
                }
                z = false;
            } else {
                int i14 = i8;
                TreeNode treeNode2 = null;
                if (i9 < 0 || i9 >= length || (i3 = i9 + length) >= length2) {
                    i = i7;
                    i2 = length2;
                    forwardingNode = forwardingNode2;
                    if (z2) {
                        this.nextTable = null;
                        this.table = nodeArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    DesugarUnsafe desugarUnsafe2 = U;
                    long j2 = SIZECTL;
                    int i15 = concurrentHashMap.sizeCtl;
                    int i16 = i9;
                    if (!desugarUnsafe2.compareAndSetInt(this, j2, i15, i15 - 1)) {
                        i9 = i16;
                    } else {
                        if (i15 - 2 != (resizeStamp(length) << 16)) {
                            return;
                        }
                        i9 = length;
                        z = true;
                        z2 = true;
                    }
                } else {
                    ?? tabAt = tabAt(nodeArr4, i9);
                    if (tabAt == 0) {
                        z = casTabAt(nodeArr4, i9, null, forwardingNode2);
                        concurrentHashMap = concurrentHashMap2;
                        i = i7;
                        i2 = length2;
                        forwardingNode = forwardingNode2;
                    } else {
                        int i17 = tabAt.hash;
                        if (i17 == -1) {
                            concurrentHashMap = concurrentHashMap2;
                            i = i7;
                            i2 = length2;
                            forwardingNode = forwardingNode2;
                            z = true;
                        } else {
                            synchronized (tabAt) {
                                if (tabAt(nodeArr4, i9) == tabAt) {
                                    if (i17 >= 0) {
                                        int i18 = i17 & length;
                                        TreeNode treeNode3 = tabAt;
                                        for (TreeNode treeNode4 = tabAt.next; treeNode4 != null; treeNode4 = treeNode4.next) {
                                            int i19 = treeNode4.hash & length;
                                            if (i19 != i18) {
                                                treeNode3 = treeNode4;
                                                i18 = i19;
                                            }
                                        }
                                        if (i18 == 0) {
                                            treeNode = null;
                                            treeNode2 = treeNode3;
                                        } else {
                                            treeNode = treeNode3;
                                        }
                                        Node node = tabAt;
                                        while (node != treeNode3) {
                                            int i20 = node.hash;
                                            Object obj = node.key;
                                            int i21 = i7;
                                            Object obj2 = node.val;
                                            if ((i20 & length) == 0) {
                                                i4 = length2;
                                                treeNode2 = new Node(i20, obj, obj2, treeNode2);
                                            } else {
                                                i4 = length2;
                                                treeNode = new Node(i20, obj, obj2, treeNode);
                                            }
                                            node = node.next;
                                            i7 = i21;
                                            length2 = i4;
                                        }
                                        i = i7;
                                        i2 = length2;
                                        setTabAt(nodeArr3, i9, treeNode2);
                                        setTabAt(nodeArr3, i3, treeNode);
                                        setTabAt(nodeArr4, i9, forwardingNode2);
                                        forwardingNode = forwardingNode2;
                                    } else {
                                        i = i7;
                                        i2 = length2;
                                        if (tabAt instanceof TreeBin) {
                                            TreeBin treeBin3 = (TreeBin) tabAt;
                                            TreeNode treeNode5 = null;
                                            TreeNode treeNode6 = null;
                                            Node node2 = treeBin3.first;
                                            int i22 = 0;
                                            int i23 = 0;
                                            TreeNode treeNode7 = null;
                                            while (node2 != null) {
                                                TreeBin treeBin4 = treeBin3;
                                                int i24 = node2.hash;
                                                ForwardingNode forwardingNode3 = forwardingNode2;
                                                TreeNode treeNode8 = new TreeNode(i24, node2.key, node2.val, null, null);
                                                if ((i24 & length) == 0) {
                                                    treeNode8.prev = treeNode6;
                                                    if (treeNode6 == null) {
                                                        treeNode2 = treeNode8;
                                                    } else {
                                                        treeNode6.next = treeNode8;
                                                    }
                                                    i22++;
                                                    treeNode6 = treeNode8;
                                                } else {
                                                    treeNode8.prev = treeNode5;
                                                    if (treeNode5 == null) {
                                                        treeNode7 = treeNode8;
                                                    } else {
                                                        treeNode5.next = treeNode8;
                                                    }
                                                    i23++;
                                                    treeNode5 = treeNode8;
                                                }
                                                node2 = node2.next;
                                                treeBin3 = treeBin4;
                                                forwardingNode2 = forwardingNode3;
                                            }
                                            TreeBin treeBin5 = treeBin3;
                                            ForwardingNode forwardingNode4 = forwardingNode2;
                                            if (i22 <= 6) {
                                                treeBin = untreeify(treeNode2);
                                            } else {
                                                treeBin = i23 != 0 ? new TreeBin(treeNode2) : treeBin5;
                                            }
                                            if (i23 <= 6) {
                                                treeBin2 = untreeify(treeNode7);
                                            } else {
                                                treeBin2 = i22 != 0 ? new TreeBin(treeNode7) : treeBin5;
                                            }
                                            setTabAt(nodeArr3, i9, treeBin);
                                            setTabAt(nodeArr3, i3, treeBin2);
                                            nodeArr4 = nodeArr;
                                            forwardingNode = forwardingNode4;
                                            setTabAt(nodeArr4, i9, forwardingNode);
                                        }
                                    }
                                    z = true;
                                } else {
                                    i = i7;
                                    i2 = length2;
                                }
                                forwardingNode = forwardingNode2;
                            }
                            concurrentHashMap = this;
                        }
                    }
                }
                forwardingNode2 = forwardingNode;
                concurrentHashMap2 = concurrentHashMap;
                i8 = i14;
                i7 = i;
                length2 = i2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class CounterCell {
        volatile long value;

        CounterCell(long j) {
            this.value = j;
        }
    }

    final long sumCount() {
        CounterCell[] counterCellArr = this.counterCells;
        long j = this.baseCount;
        if (counterCellArr != null) {
            for (CounterCell counterCell : counterCellArr) {
                if (counterCell != null) {
                    j += counterCell.value;
                }
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x009d, code lost:
    
        if (r24.counterCells != r7) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x009f, code lost:
    
        r24.counterCells = (j$.util.concurrent.ConcurrentHashMap.CounterCell[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void fullAddCount(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.fullAddCount(long, boolean):void");
    }

    private final void treeifyBin(Node[] nodeArr, int i) {
        if (nodeArr != null) {
            int length = nodeArr.length;
            if (length < 64) {
                tryPresize(length << 1);
                return;
            }
            Node tabAt = tabAt(nodeArr, i);
            if (tabAt == null || tabAt.hash < 0) {
                return;
            }
            synchronized (tabAt) {
                if (tabAt(nodeArr, i) == tabAt) {
                    TreeNode treeNode = null;
                    Node node = tabAt;
                    TreeNode treeNode2 = null;
                    while (node != null) {
                        TreeNode treeNode3 = new TreeNode(node.hash, node.key, node.val, null, null);
                        treeNode3.prev = treeNode2;
                        if (treeNode2 == null) {
                            treeNode = treeNode3;
                        } else {
                            treeNode2.next = treeNode3;
                        }
                        node = node.next;
                        treeNode2 = treeNode3;
                    }
                    setTabAt(nodeArr, i, new TreeBin(treeNode));
                }
            }
        }
    }

    static Node untreeify(Node node) {
        Node node2 = null;
        Node node3 = null;
        while (node != null) {
            Node node4 = new Node(node.hash, node.key, node.val);
            if (node3 == null) {
                node2 = node4;
            } else {
                node3.next = node4;
            }
            node = node.next;
            node3 = node4;
        }
        return node2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class TreeNode extends Node {
        TreeNode left;
        TreeNode parent;
        TreeNode prev;
        boolean red;
        TreeNode right;

        TreeNode(int i, Object obj, Object obj2, Node node, TreeNode treeNode) {
            super(i, obj, obj2, node);
            this.parent = treeNode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        Node find(int i, Object obj) {
            return findTreeNode(i, obj, null);
        }

        final TreeNode findTreeNode(int i, Object obj, Class cls) {
            int compareComparables;
            if (obj == null) {
                return null;
            }
            TreeNode treeNode = this;
            do {
                TreeNode treeNode2 = treeNode.left;
                TreeNode treeNode3 = treeNode.right;
                int i2 = treeNode.hash;
                if (i2 <= i) {
                    if (i2 >= i) {
                        Object obj2 = treeNode.key;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return treeNode;
                        }
                        if (treeNode2 != null) {
                            if (treeNode3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) {
                                    TreeNode findTreeNode = treeNode3.findTreeNode(i, obj, cls);
                                    if (findTreeNode != null) {
                                        return findTreeNode;
                                    }
                                } else if (compareComparables >= 0) {
                                    treeNode2 = treeNode3;
                                }
                            }
                        }
                    }
                    treeNode = treeNode3;
                }
                treeNode = treeNode2;
            } while (treeNode != null);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class TreeBin extends Node {
        private static final long LOCKSTATE;
        private static final DesugarUnsafe U;
        volatile TreeNode first;
        volatile int lockState;
        TreeNode root;
        volatile Thread waiter;

        static {
            DesugarUnsafe unsafe = DesugarUnsafe.getUnsafe();
            U = unsafe;
            LOCKSTATE = unsafe.objectFieldOffset(TreeBin.class, "lockState");
        }

        static int tieBreakOrder(Object obj, Object obj2) {
            int compareTo;
            return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
        }

        TreeBin(TreeNode treeNode) {
            super(-2, null, null);
            int compareComparables;
            int tieBreakOrder;
            this.first = treeNode;
            TreeNode treeNode2 = null;
            while (treeNode != null) {
                TreeNode treeNode3 = (TreeNode) treeNode.next;
                treeNode.right = null;
                treeNode.left = null;
                if (treeNode2 == null) {
                    treeNode.parent = null;
                    treeNode.red = false;
                } else {
                    Object obj = treeNode.key;
                    int i = treeNode.hash;
                    TreeNode treeNode4 = treeNode2;
                    Class cls = null;
                    while (true) {
                        Object obj2 = treeNode4.key;
                        int i2 = treeNode4.hash;
                        if (i2 > i) {
                            tieBreakOrder = -1;
                        } else if (i2 < i) {
                            tieBreakOrder = 1;
                        } else {
                            tieBreakOrder = ((cls == null && (cls = ConcurrentHashMap.comparableClassFor(obj)) == null) || (compareComparables = ConcurrentHashMap.compareComparables(cls, obj, obj2)) == 0) ? tieBreakOrder(obj, obj2) : compareComparables;
                        }
                        TreeNode treeNode5 = tieBreakOrder <= 0 ? treeNode4.left : treeNode4.right;
                        if (treeNode5 == null) {
                            break;
                        } else {
                            treeNode4 = treeNode5;
                        }
                    }
                    treeNode.parent = treeNode4;
                    if (tieBreakOrder <= 0) {
                        treeNode4.left = treeNode;
                    } else {
                        treeNode4.right = treeNode;
                    }
                    treeNode = balanceInsertion(treeNode2, treeNode);
                }
                treeNode2 = treeNode;
                treeNode = treeNode3;
            }
            this.root = treeNode2;
        }

        private final void lockRoot() {
            if (U.compareAndSetInt(this, LOCKSTATE, 0, 1)) {
                return;
            }
            contendedLock();
        }

        private final void unlockRoot() {
            this.lockState = 0;
        }

        private final void contendedLock() {
            boolean z = false;
            while (true) {
                int i = this.lockState;
                if ((i & (-3)) == 0) {
                    if (U.compareAndSetInt(this, LOCKSTATE, i, 1)) {
                        break;
                    }
                } else if ((i & 2) == 0) {
                    if (U.compareAndSetInt(this, LOCKSTATE, i, i | 2)) {
                        z = true;
                        this.waiter = Thread.currentThread();
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.waiter = null;
            }
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.Node
        final Node find(int i, Object obj) {
            Object obj2;
            Thread thread;
            Thread thread2;
            TreeNode treeNode = null;
            if (obj != null) {
                Node node = this.first;
                while (node != null) {
                    int i2 = this.lockState;
                    if ((i2 & 3) != 0) {
                        if (node.hash == i && ((obj2 = node.key) == obj || (obj2 != null && obj.equals(obj2)))) {
                            return node;
                        }
                        node = node.next;
                    } else {
                        DesugarUnsafe desugarUnsafe = U;
                        long j = LOCKSTATE;
                        if (desugarUnsafe.compareAndSetInt(this, j, i2, i2 + 4)) {
                            try {
                                TreeNode treeNode2 = this.root;
                                if (treeNode2 != null) {
                                    treeNode = treeNode2.findTreeNode(i, obj, null);
                                }
                                if (desugarUnsafe.getAndAddInt(this, j, -4) == 6 && (thread2 = this.waiter) != null) {
                                    LockSupport.unpark(thread2);
                                }
                                return treeNode;
                            } catch (Throwable th) {
                                if (U.getAndAddInt(this, LOCKSTATE, -4) == 6 && (thread = this.waiter) != null) {
                                    LockSupport.unpark(thread);
                                }
                                throw th;
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0056, code lost:
        
            return r2;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final j$.util.concurrent.ConcurrentHashMap.TreeNode putTreeVal(int r13, java.lang.Object r14, java.lang.Object r15) {
            /*
                r12 = this;
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = r12.root
                r1 = 0
                r2 = 0
                r3 = r1
            L5:
                if (r0 != 0) goto L18
                j$.util.concurrent.ConcurrentHashMap$TreeNode r0 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r8 = 0
                r9 = 0
                r4 = r0
                r5 = r13
                r6 = r14
                r7 = r15
                r4.<init>(r5, r6, r7, r8, r9)
                r12.root = r0
                r12.first = r0
                goto L97
            L18:
                int r4 = r0.hash
                r9 = 1
                if (r4 <= r13) goto L20
                r4 = -1
                r10 = -1
                goto L5f
            L20:
                if (r4 >= r13) goto L24
                r10 = 1
                goto L5f
            L24:
                java.lang.Object r4 = r0.key
                if (r4 == r14) goto La0
                if (r4 == 0) goto L32
                boolean r5 = r14.equals(r4)
                if (r5 == 0) goto L32
                goto La0
            L32:
                if (r3 != 0) goto L3a
                java.lang.Class r3 = j$.util.concurrent.ConcurrentHashMap.comparableClassFor(r14)
                if (r3 == 0) goto L40
            L3a:
                int r5 = j$.util.concurrent.ConcurrentHashMap.compareComparables(r3, r14, r4)
                if (r5 != 0) goto L5e
            L40:
                if (r2 != 0) goto L58
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r0.left
                if (r2 == 0) goto L4c
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r2.findTreeNode(r13, r14, r3)
                if (r2 != 0) goto L56
            L4c:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r0.right
                if (r2 == 0) goto L57
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r2.findTreeNode(r13, r14, r3)
                if (r2 == 0) goto L57
            L56:
                return r2
            L57:
                r2 = 1
            L58:
                int r4 = tieBreakOrder(r14, r4)
                r10 = r4
                goto L5f
            L5e:
                r10 = r5
            L5f:
                if (r10 > 0) goto L64
                j$.util.concurrent.ConcurrentHashMap$TreeNode r4 = r0.left
                goto L66
            L64:
                j$.util.concurrent.ConcurrentHashMap$TreeNode r4 = r0.right
            L66:
                if (r4 != 0) goto L9d
                j$.util.concurrent.ConcurrentHashMap$TreeNode r2 = r12.first
                j$.util.concurrent.ConcurrentHashMap$TreeNode r11 = new j$.util.concurrent.ConcurrentHashMap$TreeNode
                r3 = r11
                r4 = r13
                r5 = r14
                r6 = r15
                r7 = r2
                r8 = r0
                r3.<init>(r4, r5, r6, r7, r8)
                r12.first = r11
                if (r2 == 0) goto L7b
                r2.prev = r11
            L7b:
                if (r10 > 0) goto L80
                r0.left = r11
                goto L82
            L80:
                r0.right = r11
            L82:
                boolean r13 = r0.red
                if (r13 != 0) goto L89
                r11.red = r9
                goto L97
            L89:
                r12.lockRoot()
                j$.util.concurrent.ConcurrentHashMap$TreeNode r13 = r12.root     // Catch: java.lang.Throwable -> L98
                j$.util.concurrent.ConcurrentHashMap$TreeNode r13 = balanceInsertion(r13, r11)     // Catch: java.lang.Throwable -> L98
                r12.root = r13     // Catch: java.lang.Throwable -> L98
                r12.unlockRoot()
            L97:
                return r1
            L98:
                r13 = move-exception
                r12.unlockRoot()
                throw r13
            L9d:
                r0 = r4
                goto L5
            La0:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.putTreeVal(int, java.lang.Object, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$TreeNode");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:21:0x002f, B:25:0x0038, B:29:0x003e, B:31:0x004c, B:32:0x0064, B:34:0x006a, B:35:0x006c, B:41:0x008d, B:44:0x009e, B:45:0x0095, B:47:0x0099, B:48:0x009c, B:49:0x00a4, B:52:0x00ad, B:54:0x00b1, B:56:0x00b5, B:58:0x00b9, B:59:0x00c2, B:61:0x00bc, B:63:0x00c0, B:66:0x00a9, B:68:0x0076, B:70:0x007a, B:71:0x007d, B:72:0x0051, B:74:0x0057, B:76:0x005b, B:77:0x005e, B:78:0x0060), top: B:20:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b1 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:21:0x002f, B:25:0x0038, B:29:0x003e, B:31:0x004c, B:32:0x0064, B:34:0x006a, B:35:0x006c, B:41:0x008d, B:44:0x009e, B:45:0x0095, B:47:0x0099, B:48:0x009c, B:49:0x00a4, B:52:0x00ad, B:54:0x00b1, B:56:0x00b5, B:58:0x00b9, B:59:0x00c2, B:61:0x00bc, B:63:0x00c0, B:66:0x00a9, B:68:0x0076, B:70:0x007a, B:71:0x007d, B:72:0x0051, B:74:0x0057, B:76:0x005b, B:77:0x005e, B:78:0x0060), top: B:20:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00b9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:21:0x002f, B:25:0x0038, B:29:0x003e, B:31:0x004c, B:32:0x0064, B:34:0x006a, B:35:0x006c, B:41:0x008d, B:44:0x009e, B:45:0x0095, B:47:0x0099, B:48:0x009c, B:49:0x00a4, B:52:0x00ad, B:54:0x00b1, B:56:0x00b5, B:58:0x00b9, B:59:0x00c2, B:61:0x00bc, B:63:0x00c0, B:66:0x00a9, B:68:0x0076, B:70:0x007a, B:71:0x007d, B:72:0x0051, B:74:0x0057, B:76:0x005b, B:77:0x005e, B:78:0x0060), top: B:20:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00bc A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:21:0x002f, B:25:0x0038, B:29:0x003e, B:31:0x004c, B:32:0x0064, B:34:0x006a, B:35:0x006c, B:41:0x008d, B:44:0x009e, B:45:0x0095, B:47:0x0099, B:48:0x009c, B:49:0x00a4, B:52:0x00ad, B:54:0x00b1, B:56:0x00b5, B:58:0x00b9, B:59:0x00c2, B:61:0x00bc, B:63:0x00c0, B:66:0x00a9, B:68:0x0076, B:70:0x007a, B:71:0x007d, B:72:0x0051, B:74:0x0057, B:76:0x005b, B:77:0x005e, B:78:0x0060), top: B:20:0x002f }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x00a9 A[Catch: all -> 0x00c9, TryCatch #0 {all -> 0x00c9, blocks: (B:21:0x002f, B:25:0x0038, B:29:0x003e, B:31:0x004c, B:32:0x0064, B:34:0x006a, B:35:0x006c, B:41:0x008d, B:44:0x009e, B:45:0x0095, B:47:0x0099, B:48:0x009c, B:49:0x00a4, B:52:0x00ad, B:54:0x00b1, B:56:0x00b5, B:58:0x00b9, B:59:0x00c2, B:61:0x00bc, B:63:0x00c0, B:66:0x00a9, B:68:0x0076, B:70:0x007a, B:71:0x007d, B:72:0x0051, B:74:0x0057, B:76:0x005b, B:77:0x005e, B:78:0x0060), top: B:20:0x002f }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final boolean removeTreeNode(j$.util.concurrent.ConcurrentHashMap.TreeNode r10) {
            /*
                Method dump skipped, instructions count: 207
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.TreeBin.removeTreeNode(j$.util.concurrent.ConcurrentHashMap$TreeNode):boolean");
        }

        static TreeNode rotateLeft(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            if (treeNode2 != null && (treeNode3 = treeNode2.right) != null) {
                TreeNode treeNode4 = treeNode3.left;
                treeNode2.right = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.left == treeNode2) {
                    treeNode5.left = treeNode3;
                } else {
                    treeNode5.right = treeNode3;
                }
                treeNode3.left = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static TreeNode rotateRight(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            if (treeNode2 != null && (treeNode3 = treeNode2.left) != null) {
                TreeNode treeNode4 = treeNode3.right;
                treeNode2.left = treeNode4;
                if (treeNode4 != null) {
                    treeNode4.parent = treeNode2;
                }
                TreeNode treeNode5 = treeNode2.parent;
                treeNode3.parent = treeNode5;
                if (treeNode5 == null) {
                    treeNode3.red = false;
                    treeNode = treeNode3;
                } else if (treeNode5.right == treeNode2) {
                    treeNode5.right = treeNode3;
                } else {
                    treeNode5.left = treeNode3;
                }
                treeNode3.right = treeNode2;
                treeNode2.parent = treeNode3;
            }
            return treeNode;
        }

        static TreeNode balanceInsertion(TreeNode treeNode, TreeNode treeNode2) {
            TreeNode treeNode3;
            treeNode2.red = true;
            while (true) {
                TreeNode treeNode4 = treeNode2.parent;
                if (treeNode4 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                }
                if (!treeNode4.red || (treeNode3 = treeNode4.parent) == null) {
                    break;
                }
                TreeNode treeNode5 = treeNode3.left;
                if (treeNode4 == treeNode5) {
                    TreeNode treeNode6 = treeNode3.right;
                    if (treeNode6 != null && treeNode6.red) {
                        treeNode6.red = false;
                        treeNode4.red = false;
                        treeNode3.red = true;
                        treeNode2 = treeNode3;
                    } else {
                        if (treeNode2 == treeNode4.right) {
                            treeNode = rotateLeft(treeNode, treeNode4);
                            TreeNode treeNode7 = treeNode4.parent;
                            treeNode3 = treeNode7 == null ? null : treeNode7.parent;
                            treeNode4 = treeNode7;
                            treeNode2 = treeNode4;
                        }
                        if (treeNode4 != null) {
                            treeNode4.red = false;
                            if (treeNode3 != null) {
                                treeNode3.red = true;
                                treeNode = rotateRight(treeNode, treeNode3);
                            }
                        }
                    }
                } else if (treeNode5 != null && treeNode5.red) {
                    treeNode5.red = false;
                    treeNode4.red = false;
                    treeNode3.red = true;
                    treeNode2 = treeNode3;
                } else {
                    if (treeNode2 == treeNode4.left) {
                        treeNode = rotateRight(treeNode, treeNode4);
                        TreeNode treeNode8 = treeNode4.parent;
                        treeNode3 = treeNode8 == null ? null : treeNode8.parent;
                        treeNode4 = treeNode8;
                        treeNode2 = treeNode4;
                    }
                    if (treeNode4 != null) {
                        treeNode4.red = false;
                        if (treeNode3 != null) {
                            treeNode3.red = true;
                            treeNode = rotateLeft(treeNode, treeNode3);
                        }
                    }
                }
            }
            return treeNode;
        }

        static TreeNode balanceDeletion(TreeNode treeNode, TreeNode treeNode2) {
            while (treeNode2 != null && treeNode2 != treeNode) {
                TreeNode treeNode3 = treeNode2.parent;
                if (treeNode3 == null) {
                    treeNode2.red = false;
                    return treeNode2;
                }
                if (treeNode2.red) {
                    treeNode2.red = false;
                    return treeNode;
                }
                TreeNode treeNode4 = treeNode3.left;
                if (treeNode4 == treeNode2) {
                    TreeNode treeNode5 = treeNode3.right;
                    if (treeNode5 != null && treeNode5.red) {
                        treeNode5.red = false;
                        treeNode3.red = true;
                        treeNode = rotateLeft(treeNode, treeNode3);
                        treeNode3 = treeNode2.parent;
                        treeNode5 = treeNode3 == null ? null : treeNode3.right;
                    }
                    if (treeNode5 != null) {
                        TreeNode treeNode6 = treeNode5.left;
                        TreeNode treeNode7 = treeNode5.right;
                        if ((treeNode7 == null || !treeNode7.red) && (treeNode6 == null || !treeNode6.red)) {
                            treeNode5.red = true;
                        } else {
                            if (treeNode7 == null || !treeNode7.red) {
                                if (treeNode6 != null) {
                                    treeNode6.red = false;
                                }
                                treeNode5.red = true;
                                treeNode = rotateRight(treeNode, treeNode5);
                                treeNode3 = treeNode2.parent;
                                treeNode5 = treeNode3 != null ? treeNode3.right : null;
                            }
                            if (treeNode5 != null) {
                                treeNode5.red = treeNode3 == null ? false : treeNode3.red;
                                TreeNode treeNode8 = treeNode5.right;
                                if (treeNode8 != null) {
                                    treeNode8.red = false;
                                }
                            }
                            if (treeNode3 != null) {
                                treeNode3.red = false;
                                treeNode = rotateLeft(treeNode, treeNode3);
                            }
                            treeNode2 = treeNode;
                        }
                    }
                    treeNode2 = treeNode3;
                } else {
                    if (treeNode4 != null && treeNode4.red) {
                        treeNode4.red = false;
                        treeNode3.red = true;
                        treeNode = rotateRight(treeNode, treeNode3);
                        treeNode3 = treeNode2.parent;
                        treeNode4 = treeNode3 == null ? null : treeNode3.left;
                    }
                    if (treeNode4 != null) {
                        TreeNode treeNode9 = treeNode4.left;
                        TreeNode treeNode10 = treeNode4.right;
                        if ((treeNode9 == null || !treeNode9.red) && (treeNode10 == null || !treeNode10.red)) {
                            treeNode4.red = true;
                        } else {
                            if (treeNode9 == null || !treeNode9.red) {
                                if (treeNode10 != null) {
                                    treeNode10.red = false;
                                }
                                treeNode4.red = true;
                                treeNode = rotateLeft(treeNode, treeNode4);
                                treeNode3 = treeNode2.parent;
                                treeNode4 = treeNode3 != null ? treeNode3.left : null;
                            }
                            if (treeNode4 != null) {
                                treeNode4.red = treeNode3 == null ? false : treeNode3.red;
                                TreeNode treeNode11 = treeNode4.left;
                                if (treeNode11 != null) {
                                    treeNode11.red = false;
                                }
                            }
                            if (treeNode3 != null) {
                                treeNode3.red = false;
                                treeNode = rotateRight(treeNode, treeNode3);
                            }
                            treeNode2 = treeNode;
                        }
                    }
                    treeNode2 = treeNode3;
                }
            }
            return treeNode;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class TableStack {
        int index;
        int length;
        TableStack next;
        Node[] tab;

        TableStack() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class Traverser {
        int baseIndex;
        int baseLimit;
        final int baseSize;
        int index;
        Node next = null;
        TableStack spare;
        TableStack stack;
        Node[] tab;

        Traverser(Node[] nodeArr, int i, int i2, int i3) {
            this.tab = nodeArr;
            this.baseSize = i;
            this.index = i2;
            this.baseIndex = i2;
            this.baseLimit = i3;
        }

        final Node advance() {
            Node[] nodeArr;
            int length;
            int i;
            Node node = this.next;
            if (node != null) {
                node = node.next;
            }
            while (node == null) {
                if (this.baseIndex >= this.baseLimit || (nodeArr = this.tab) == null || (length = nodeArr.length) <= (i = this.index) || i < 0) {
                    this.next = null;
                    return null;
                }
                Node tabAt = ConcurrentHashMap.tabAt(nodeArr, i);
                if (tabAt == null || tabAt.hash >= 0) {
                    node = tabAt;
                } else if (tabAt instanceof ForwardingNode) {
                    this.tab = ((ForwardingNode) tabAt).nextTable;
                    pushState(nodeArr, i, length);
                    node = null;
                } else {
                    node = tabAt instanceof TreeBin ? ((TreeBin) tabAt).first : null;
                }
                if (this.stack != null) {
                    recoverState(length);
                } else {
                    int i2 = i + this.baseSize;
                    this.index = i2;
                    if (i2 >= length) {
                        int i3 = this.baseIndex + 1;
                        this.baseIndex = i3;
                        this.index = i3;
                    }
                }
            }
            this.next = node;
            return node;
        }

        private void pushState(Node[] nodeArr, int i, int i2) {
            TableStack tableStack = this.spare;
            if (tableStack != null) {
                this.spare = tableStack.next;
            } else {
                tableStack = new TableStack();
            }
            tableStack.tab = nodeArr;
            tableStack.length = i2;
            tableStack.index = i;
            tableStack.next = this.stack;
            this.stack = tableStack;
        }

        private void recoverState(int i) {
            TableStack tableStack;
            while (true) {
                tableStack = this.stack;
                if (tableStack == null) {
                    break;
                }
                int i2 = this.index;
                int i3 = tableStack.length;
                int i4 = i2 + i3;
                this.index = i4;
                if (i4 < i) {
                    break;
                }
                this.index = tableStack.index;
                this.tab = tableStack.tab;
                tableStack.tab = null;
                TableStack tableStack2 = tableStack.next;
                tableStack.next = this.spare;
                this.stack = tableStack2;
                this.spare = tableStack;
                i = i3;
            }
            if (tableStack == null) {
                int i5 = this.index + this.baseSize;
                this.index = i5;
                if (i5 >= i) {
                    int i6 = this.baseIndex + 1;
                    this.baseIndex = i6;
                    this.index = i6;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class BaseIterator extends Traverser {
        Node lastReturned;
        final ConcurrentHashMap map;

        BaseIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3);
            this.map = concurrentHashMap;
            advance();
        }

        public final boolean hasNext() {
            return this.next != null;
        }

        public final boolean hasMoreElements() {
            return this.next != null;
        }

        public final void remove() {
            Node node = this.lastReturned;
            if (node == null) {
                throw new IllegalStateException();
            }
            this.lastReturned = null;
            this.map.replaceNode(node.key, null, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class KeyIterator extends BaseIterator implements Iterator, Enumeration, j$.util.Iterator {
        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        KeyIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node == null) {
                throw new NoSuchElementException();
            }
            Object obj = node.key;
            this.lastReturned = node;
            advance();
            return obj;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class ValueIterator extends BaseIterator implements java.util.Iterator, Enumeration, j$.util.Iterator {
        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        ValueIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            Node node = this.next;
            if (node == null) {
                throw new NoSuchElementException();
            }
            Object obj = node.val;
            this.lastReturned = node;
            advance();
            return obj;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    /* loaded from: classes5.dex */
    final class EntryIterator extends BaseIterator implements java.util.Iterator, j$.util.Iterator {
        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        EntryIterator(Node[] nodeArr, int i, int i2, int i3, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3, concurrentHashMap);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Map.Entry next() {
            Node node = this.next;
            if (node == null) {
                throw new NoSuchElementException();
            }
            Object obj = node.key;
            Object obj2 = node.val;
            this.lastReturned = node;
            advance();
            return new MapEntry(obj, obj2, this.map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public final class MapEntry implements Map.Entry {
        final Object key;
        final ConcurrentHashMap map;
        Object val;

        MapEntry(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
            this.key = obj;
            this.val = obj2;
            this.map = concurrentHashMap;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.val;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.key.hashCode() ^ this.val.hashCode();
        }

        public String toString() {
            return Helpers.mapEntryToString(this.key, this.val);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.key) || key.equals(obj2)) && (value == (obj3 = this.val) || value.equals(obj3));
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj == null) {
                throw null;
            }
            Object obj2 = this.val;
            this.val = obj;
            this.map.put(this.key, obj);
            return obj2;
        }
    }

    /* loaded from: classes5.dex */
    final class KeySpliterator extends Traverser implements Spliterator {
        long est;

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        KeySpliterator(Node[] nodeArr, int i, int i2, int i3, long j) {
            super(nodeArr, i, i2, i3);
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public KeySpliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new KeySpliterator(nodeArr, i4, i3, i2, j);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(advance.key);
                }
            }
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.key);
            return true;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }
    }

    /* loaded from: classes5.dex */
    final class ValueSpliterator extends Traverser implements Spliterator {
        long est;

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4352;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        ValueSpliterator(Node[] nodeArr, int i, int i2, int i3, long j) {
            super(nodeArr, i, i2, i3);
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public ValueSpliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new ValueSpliterator(nodeArr, i4, i3, i2, j);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(advance.val);
                }
            }
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(advance.val);
            return true;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }
    }

    /* loaded from: classes5.dex */
    final class EntrySpliterator extends Traverser implements Spliterator {
        long est;
        final ConcurrentHashMap map;

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        EntrySpliterator(Node[] nodeArr, int i, int i2, int i3, long j, ConcurrentHashMap concurrentHashMap) {
            super(nodeArr, i, i2, i3);
            this.map = concurrentHashMap;
            this.est = j;
        }

        @Override // j$.util.Spliterator
        public EntrySpliterator trySplit() {
            int i = this.baseIndex;
            int i2 = this.baseLimit;
            int i3 = (i + i2) >>> 1;
            if (i3 <= i) {
                return null;
            }
            Node[] nodeArr = this.tab;
            int i4 = this.baseSize;
            this.baseLimit = i3;
            long j = this.est >>> 1;
            this.est = j;
            return new EntrySpliterator(nodeArr, i4, i3, i2, j, this.map);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            while (true) {
                Node advance = advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(new MapEntry(advance.key, advance.val, this.map));
                }
            }
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node advance = advance();
            if (advance == null) {
                return false;
            }
            consumer.accept(new MapEntry(advance.key, advance.val, this.map));
            return true;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.est;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public abstract class CollectionView implements Collection, Serializable {
        private static final long serialVersionUID = 7249069246763182397L;
        final ConcurrentHashMap map;

        @Override // java.util.Collection
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection, java.lang.Iterable
        public abstract java.util.Iterator iterator();

        @Override // java.util.Collection
        public abstract boolean remove(Object obj);

        CollectionView(ConcurrentHashMap concurrentHashMap) {
            this.map = concurrentHashMap;
        }

        @Override // java.util.Collection
        public final void clear() {
            this.map.clear();
        }

        @Override // java.util.Collection
        public final int size() {
            return this.map.size();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return this.map.isEmpty();
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            long mappingCount = this.map.mappingCount();
            if (mappingCount > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i = (int) mappingCount;
            Object[] objArr = new Object[i];
            int i2 = 0;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    if (i >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                    objArr = Arrays.copyOf(objArr, i3);
                    i = i3;
                }
                objArr[i2] = next;
                i2++;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }

        @Override // java.util.Collection
        public final Object[] toArray(Object[] objArr) {
            long mappingCount = this.map.mappingCount();
            if (mappingCount > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i = (int) mappingCount;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            int i2 = 0;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArr2 = Arrays.copyOf(objArr2, i3);
                    length = i3;
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            java.util.Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(',');
                    sb.append(' ');
                }
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection collection) {
            if (collection == this) {
                return true;
            }
            for (Object obj : collection) {
                if (obj == null || !contains(obj)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            if (collection == null) {
                throw null;
            }
            Node[] nodeArr = this.map.table;
            boolean z = false;
            if (nodeArr == null) {
                return false;
            }
            if ((collection instanceof Set) && collection.size() > nodeArr.length) {
                java.util.Iterator it = iterator();
                while (it.hasNext()) {
                    if (collection.contains(it.next())) {
                        it.remove();
                        z = true;
                    }
                }
            } else {
                java.util.Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    z |= remove(it2.next());
                }
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            if (collection == null) {
                throw null;
            }
            boolean z = false;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    /* loaded from: classes5.dex */
    public class KeySetView extends CollectionView implements Set, j$.util.Collection {
        private static final long serialVersionUID = 7249069246763182397L;
        private final Object value;

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public /* bridge */ /* synthetic */ boolean removeAll(java.util.Collection collection) {
            return super.removeAll(collection);
        }

        KeySetView(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
            this.value = obj;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            return this.map.remove(obj) != null;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeyIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Object obj) {
            Object obj2 = this.value;
            if (obj2 != null) {
                return this.map.putVal(obj, obj2, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection collection) {
            Object obj = this.value;
            if (obj == null) {
                throw new UnsupportedOperationException();
            }
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (this.map.putVal(it.next(), obj, true) == null) {
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            java.util.Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().hashCode();
            }
            return i;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new KeySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // j$.util.Collection
        public void forEach(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(advance.key);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    final class ValuesView extends CollectionView implements j$.util.Collection {
        private static final long serialVersionUID = 2249069246763182397L;

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        ValuesView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean contains(Object obj) {
            return this.map.containsValue(obj);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public final boolean remove(Object obj) {
            if (obj == null) {
                return false;
            }
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                if (obj.equals(it.next())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(java.util.Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean removeAll(java.util.Collection collection) {
            if (collection == null) {
                throw null;
            }
            boolean z = false;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.Collection
        public boolean removeIf(Predicate predicate) {
            return this.map.removeValueIf(predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new ValueSpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L);
        }

        @Override // j$.util.Collection
        public void forEach(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(advance.val);
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    final class EntrySetView extends CollectionView implements Set, j$.util.Collection {
        private static final long serialVersionUID = 2249069246763182397L;

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        EntrySetView(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            Object value;
            return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.map.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.map.remove(key, value);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.CollectionView, java.util.Collection, java.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntryIterator(nodeArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean add(Map.Entry entry) {
            return this.map.putVal(entry.getKey(), entry.getValue(), false) == null;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection collection) {
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (add((Map.Entry) it.next())) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.Collection
        public boolean removeIf(Predicate predicate) {
            return this.map.removeEntryIf(predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Node[] nodeArr = this.map.table;
            int i = 0;
            if (nodeArr != null) {
                Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
                while (true) {
                    Node advance = traverser.advance();
                    if (advance == null) {
                        break;
                    }
                    i += advance.hashCode();
                }
            }
            return i;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.map;
            long sumCount = concurrentHashMap.sumCount();
            Node[] nodeArr = concurrentHashMap.table;
            int length = nodeArr == null ? 0 : nodeArr.length;
            return new EntrySpliterator(nodeArr, length, 0, length, sumCount >= 0 ? sumCount : 0L, concurrentHashMap);
        }

        @Override // j$.util.Collection
        public void forEach(Consumer consumer) {
            if (consumer == null) {
                throw null;
            }
            Node[] nodeArr = this.map.table;
            if (nodeArr == null) {
                return;
            }
            Traverser traverser = new Traverser(nodeArr, nodeArr.length, 0, nodeArr.length);
            while (true) {
                Node advance = traverser.advance();
                if (advance == null) {
                    return;
                } else {
                    consumer.accept(new MapEntry(advance.key, advance.val, this.map));
                }
            }
        }
    }
}
