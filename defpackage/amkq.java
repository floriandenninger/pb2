package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.cardboard.sdk.R;
import com.google.common.flogger.backend.google.GooglePlatform;
import com.google.common.flogger.backend.system.DefaultPlatform;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkq {
    public static volatile aych a;

    public static final amnt A(Set set) {
        return new amnt(set);
    }

    public static final void B(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    public static final void C(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    public static final void D(amnt amntVar, Set set) {
        Iterator it = amntVar.b.iterator();
        while (it.hasNext()) {
            set.add(Integer.valueOf(((Integer) it.next()).intValue()));
        }
    }

    public static void E(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void F(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void G(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Character.valueOf(c)));
        }
    }

    public static void H(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Integer.valueOf(i)));
        }
    }

    public static void I(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Long.valueOf(j)));
        }
    }

    public static void J(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(z(str, obj));
        }
    }

    public static void K(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(z(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void L(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(z(str, obj, obj2));
        }
    }

    public static void M(int i, int i2, int i3) {
        String ea;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                ea = ea(i, i3, "start index");
            } else {
                ea = (i2 < 0 || i2 > i3) ? ea(i2, i3, "end index") : z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(ea);
        }
    }

    public static void N(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void O(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void P(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(z(str, Integer.valueOf(i)));
        }
    }

    public static void Q(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(z(str, obj));
        }
    }

    public static void R(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(z(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void S(boolean z, String str, Object obj, long j) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, Long.valueOf(j)));
        }
    }

    public static void T(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, obj2));
        }
    }

    public static void U(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(z(str, obj, obj2, obj3));
        }
    }

    public static void V(int i, int i2) {
        String z;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                z = z("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    StringBuilder sb = new StringBuilder(26);
                    sb.append("negative size: ");
                    sb.append(i2);
                    throw new IllegalArgumentException(sb.toString());
                }
                z = z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(z);
        }
    }

    public static void W(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(ea(i, i2, "index"));
        }
    }

    public static ammu X(Class cls) {
        return new ammu(cls.getSimpleName());
    }

    public static ammu Y(Object obj) {
        return new ammu(obj.getClass().getSimpleName());
    }

    public static Object Z(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static anhy a(Runnable runnable, long j, long j2, TimeUnit timeUnit, shf shfVar, anic anicVar) {
        long d = shfVar.d();
        long convert = TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long convert2 = TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        SettableFuture f = SettableFuture.f();
        final AtomicReference atomicReference = new AtomicReference(null);
        atomicReference.compareAndSet(null, anicVar.schedule(new amlq(f, runnable, atomicReference, anicVar, d + convert, convert2, shfVar), j, timeUnit));
        f.d(new Runnable() { // from class: amlp
            @Override // java.lang.Runnable
            public final void run() {
                ((Future) atomicReference.get()).cancel(false);
            }
        }, angq.a);
        return f;
    }

    public static void aA(Object obj, int i) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public static void aB(Object... objArr) {
        aC(objArr, objArr.length);
    }

    public static void aC(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            aA(objArr[i2], i2);
        }
    }

    public static void aD(Iterable iterable, Object[] objArr) {
        Iterator it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public static boolean aE(amuw amuwVar, Object obj) {
        if (obj == amuwVar) {
            return true;
        }
        if (obj instanceof amuw) {
            amuw amuwVar2 = (amuw) obj;
            if (amuwVar.size() == amuwVar2.size() && amuwVar.j().size() == amuwVar2.j().size()) {
                for (amux amuxVar : amuwVar2.j()) {
                    if (amuwVar.a(amuxVar.a) != amuxVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static int aF(int i) {
        if (i < 3) {
            t(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static amrz aG(Map map) {
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return amvo.b;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r1 = (Enum) entry.getKey();
        Object value = entry.getValue();
        r(r1, value);
        EnumMap enumMap = new EnumMap(r1.getDeclaringClass());
        enumMap.put((EnumMap) r1, (Enum) value);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r12 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            r(r12, value2);
            enumMap.put((EnumMap) r12, (Enum) value2);
        }
        int size = enumMap.size();
        if (size == 0) {
            return amvo.b;
        }
        if (size == 1) {
            Map.Entry entry3 = (Map.Entry) bk(enumMap.entrySet());
            return amrz.k((Enum) entry3.getKey(), entry3.getValue());
        }
        return new amro(enumMap);
    }

    public static Object aH(Map map, Object obj) {
        map.getClass();
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static HashMap aI() {
        return new HashMap();
    }

    public static HashMap aJ(int i) {
        return new HashMap(aF(i));
    }

    public static Map.Entry aK(Object obj, Object obj2) {
        return new amrm(obj, obj2);
    }

    public static Map.Entry aL(Map.Entry entry) {
        entry.getClass();
        return new amuf(entry);
    }

    public static Map aM(Map map, amml ammlVar) {
        ammlVar.getClass();
        return new amum(map, new amuh(ammlVar));
    }

    public static ConcurrentMap aN() {
        return new ConcurrentHashMap();
    }

    public static ArrayList aO() {
        return new ArrayList();
    }

    public static ArrayList aP(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        return aQ(iterable.iterator());
    }

    public static ArrayList aQ(Iterator it) {
        ArrayList aO = aO();
        bd(aO, it);
        return aO;
    }

    @SafeVarargs
    public static ArrayList aR(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        t(length, "arraySize");
        ArrayList arrayList = new ArrayList(anaf.ag(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static ArrayList aS(int i) {
        t(i, "initialArraySize");
        return new ArrayList(i);
    }

    public static List aT(List list) {
        if (list instanceof amru) {
            return ((amru) list).a();
        }
        if (list instanceof amtw) {
            return ((amtw) list).a;
        }
        if (list instanceof RandomAccess) {
            return new amtu(list);
        }
        return new amtw(list);
    }

    public static List aU(List list, amml ammlVar) {
        if (list instanceof RandomAccess) {
            return new amty(list, ammlVar);
        }
        return new amua(list, ammlVar);
    }

    public static boolean aV(List list, Object obj) {
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (list2 instanceof RandomAccess) {
            for (int i = 0; i < size; i++) {
                if (!b(list.get(i), list2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        Iterator it2 = list2.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!it2.hasNext() || !b(it.next(), it2.next())) {
                    break;
                }
            } else if (!it2.hasNext()) {
                return true;
            }
        }
        return false;
    }

    public static int aW(Iterator it, int i) {
        it.getClass();
        int i2 = 0;
        F(i >= 0, "numberToAdvance must be nonnegative");
        while (i2 < i && it.hasNext()) {
            it.next();
            i2++;
        }
        return i2;
    }

    public static int aX(Iterator it, ammy ammyVar) {
        ammyVar.getClass();
        int i = 0;
        while (it.hasNext()) {
            if (ammyVar.a(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static amxd aY(Iterator it, ammy ammyVar) {
        it.getClass();
        ammyVar.getClass();
        return new amtm(it, ammyVar);
    }

    public static Object aZ(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    public static amml aa() {
        return new ammm();
    }

    public static int ab(Level level) {
        int intValue = level.intValue();
        if (intValue >= Level.SEVERE.intValue()) {
            return 6;
        }
        if (intValue >= Level.WARNING.intValue()) {
            return 5;
        }
        if (intValue >= Level.INFO.intValue()) {
            return 4;
        }
        return intValue >= Level.FINE.intValue() ? 3 : 2;
    }

    public static String ac(String str) {
        if (str.length() > 23) {
            int i = -1;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str = str.substring(i + 1);
        }
        String valueOf = String.valueOf(str);
        String concat = valueOf.length() != 0 ? "".concat(valueOf) : new String("");
        return concat.substring(0, Math.min(concat.length(), 23));
    }

    public static amzn ad() {
        try {
            try {
                try {
                    return (amzn) amzx.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused) {
                    return (amzn) GooglePlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused2) {
                return (amzn) DefaultPlatform.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (IllegalAccessException | InstantiationException | NoClassDefFoundError | NoSuchMethodException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static Collection ae(Collection collection, Object obj) {
        return new amwn(collection, obj);
    }

    public static Collection af(Collection collection, Object obj) {
        if (collection instanceof SortedSet) {
            return ai((SortedSet) collection, obj);
        }
        if (collection instanceof Set) {
            return ah((Set) collection, obj);
        }
        if (collection instanceof List) {
            return ag((List) collection, obj);
        }
        return ae(collection, obj);
    }

    public static List ag(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return new amwt(list, obj);
        }
        return new amwo(list, obj);
    }

    public static Set ah(Set set, Object obj) {
        return new amwu(set, obj);
    }

    public static SortedSet ai(SortedSet sortedSet, Object obj) {
        return new amwv(sortedSet, obj);
    }

    public static boolean aj(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = amvb.a;
            }
        } else {
            if (!(iterable instanceof amwg)) {
                return false;
            }
            comparator2 = ((amwg) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }

    public static int ak(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static amwe al(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new amwc(set, set2);
    }

    public static amwe am(Set set, Set set2) {
        set.getClass();
        set2.getClass();
        return new amwa(set, set2);
    }

    public static HashSet an() {
        return new HashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static HashSet ao(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new HashSet((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        HashSet an = an();
        bd(an, it);
        return an;
    }

    public static HashSet ap(Object... objArr) {
        HashSet aq = aq(objArr.length);
        Collections.addAll(aq, objArr);
        return aq;
    }

    public static HashSet aq(int i) {
        return new HashSet(aF(i));
    }

    public static Set ar() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set as() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    public static boolean at(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean au(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof amuw) {
            collection = ((amuw) collection).i();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return av(set, collection.iterator());
        }
        return be(set.iterator(), collection);
    }

    public static boolean av(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }

    public static amvw aw(Class cls, String str) {
        try {
            return new amvw(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public static void ax(amup amupVar, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(amupVar.r().size());
        for (Map.Entry entry : amupVar.r().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static Object[] ay(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }

    public static Object[] az(Class cls, int i) {
        return (Object[]) Array.newInstance((Class<?>) cls, i);
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int bA(int i) {
        return Math.max(4, bu(i + 1));
    }

    public static Object bB(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            if (i <= 256) {
                return new byte[i];
            }
            return i <= 65536 ? new short[i] : new int[i];
        }
        StringBuilder sb = new StringBuilder(52);
        sb.append("must be power of 2 between 2^1 and 2^30: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static void bC(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static void bD(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static Collection bE(Collection collection, ammy ammyVar) {
        ammyVar.getClass();
        return new ampn(collection, ammyVar);
    }

    public static Collection bF(Collection collection, amml ammlVar) {
        return new ampo(collection, ammlVar);
    }

    public static boolean bG(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean bH(Collection collection, Object obj) {
        collection.getClass();
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static int bI(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bJ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bK(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bL(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bM(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 102) {
            return 103;
        }
        if (i != 104) {
            return i != 105 ? 0 : 106;
        }
        return 105;
    }

    public static int bO(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int bP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int bR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bS(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            default:
                return 0;
        }
    }

    public static int bT(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bU(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bV(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int bW(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int bX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int bY(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int bZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }

    public static Object ba(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static Iterator bb(Iterator it, amml ammlVar) {
        ammlVar.getClass();
        return new amtn(it, ammlVar);
    }

    public static void bc(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean bd(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static boolean be(Iterator it, Collection collection) {
        collection.getClass();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static int bf(Iterable iterable, ammy ammyVar) {
        return aX(iterable.iterator(), ammyVar);
    }

    public static Iterable bg(Iterable iterable, ammy ammyVar) {
        iterable.getClass();
        ammyVar.getClass();
        return new amth(iterable, ammyVar);
    }

    public static Iterable bh(Iterable iterable, amml ammlVar) {
        ammlVar.getClass();
        return new amti(iterable, ammlVar);
    }

    public static Object bi(Iterable iterable, Object obj) {
        return aZ(iterable.iterator(), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object bj(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            if (iterable.isEmpty()) {
                throw new NoSuchElementException();
            }
            return eb(iterable);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static Object bk(Iterable iterable) {
        Iterator it = iterable.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    public static boolean bl(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        iterable.getClass();
        return bd(collection, iterable.iterator());
    }

    public static boolean bm(Iterable iterable, ammy ammyVar) {
        return aX(iterable.iterator(), ammyVar) != -1;
    }

    public static Object[] bn(Iterable iterable) {
        return ec(iterable).toArray();
    }

    public static Object[] bo(Iterable iterable, Class cls) {
        return bp(iterable, az(cls, 0));
    }

    public static Object[] bp(Iterable iterable, Object[] objArr) {
        return ec(iterable).toArray(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object bq(Iterable iterable) {
        if (iterable.isEmpty()) {
            return null;
        }
        return eb(iterable);
    }

    public static void br(Iterable iterable, ammy ammyVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            ammyVar.getClass();
            while (it.hasNext()) {
                if (ammyVar.a(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        ammyVar.getClass();
        ee((List) iterable, ammyVar);
    }

    public static int bs(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int bt(Object obj) {
        return bs(obj == null ? 0 : obj.hashCode());
    }

    public static int bu(int i) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= highestOneBit) {
            return highestOneBit;
        }
        int i2 = highestOneBit + highestOneBit;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }

    public static int bv(int i, int i2) {
        return i & (i2 ^ (-1));
    }

    public static int bw(int i, int i2, int i3) {
        return (i & (i3 ^ (-1))) | (i2 & i3);
    }

    public static int bx(int i) {
        return (i < 32 ? 4 : 2) * (i + 1);
    }

    public static int by(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int bt = bt(obj);
        int i4 = bt & i;
        int bz = bz(obj3, i4);
        if (bz == 0) {
            return -1;
        }
        int bv = bv(bt, i);
        int i5 = -1;
        while (true) {
            i2 = bz - 1;
            i3 = iArr[i2];
            if (bv(i3, i) != bv || !b(obj, objArr[i2]) || (objArr2 != null && !b(obj2, objArr2[i2]))) {
                int i6 = i3 & i;
                if (i6 == 0) {
                    return -1;
                }
                i5 = i2;
                bz = i6;
            }
        }
        int i7 = i3 & i;
        if (i5 == -1) {
            bD(obj3, i4, i7);
        } else {
            iArr[i5] = bw(iArr[i5], i7, i);
        }
        return i2;
    }

    public static int bz(Object obj, int i) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        if (obj instanceof short[]) {
            return (char) ((short[]) obj)[i];
        }
        return ((int[]) obj)[i];
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (g(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (g(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static /* bridge */ /* synthetic */ void cA(Object obj, int i, aomf aomfVar) {
        ((aoqc) obj).f(aoqp.c(i, 2), aomfVar);
    }

    public static /* bridge */ /* synthetic */ void cB(Object obj, int i, long j) {
        ((aoqc) obj).f(aoqp.c(i, 0), Long.valueOf(j));
    }

    public static aoqc cC(Object obj) {
        return ((aonm) obj).unknownFields;
    }

    public static void cD(Object obj, aoqc aoqcVar) {
        ((aonm) obj).unknownFields = aoqcVar;
    }

    public static final /* bridge */ /* synthetic */ Object cE(Object obj) {
        aoqc cC = cC(obj);
        if (cC != aoqc.a) {
            return cC;
        }
        aoqc c = aoqc.c();
        cD(obj, c);
        return c;
    }

    public static final void cF(Object obj) {
        cC(obj).e();
    }

    public static String cG(aomf aomfVar) {
        StringBuilder sb = new StringBuilder(aomfVar.d());
        for (int i = 0; i < aomfVar.d(); i++) {
            byte a2 = aomfVar.a(i);
            if (a2 != 34) {
                if (a2 != 39) {
                    if (a2 == 92) {
                        sb.append("\\\\");
                    } else {
                        switch (a2) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (a2 < 32 || a2 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((a2 >>> 6) & 3) + 48));
                                    sb.append((char) (((a2 >>> 3) & 7) + 48));
                                    sb.append((char) ((a2 & 7) + 48));
                                    break;
                                } else {
                                    sb.append((char) a2);
                                    break;
                                }
                                break;
                        }
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final void cH(aomf aomfVar, ArrayDeque arrayDeque) {
        if (aomfVar.h()) {
            int eh = eh(aomfVar.d());
            int c = aopp.c(eh + 1);
            if (arrayDeque.isEmpty() || ((aomf) arrayDeque.peek()).d() >= c) {
                arrayDeque.push(aomfVar);
                return;
            }
            int c2 = aopp.c(eh);
            aomf aomfVar2 = (aomf) arrayDeque.pop();
            while (!arrayDeque.isEmpty() && ((aomf) arrayDeque.peek()).d() < c2) {
                aomfVar2 = new aopp((aomf) arrayDeque.pop(), aomfVar2);
            }
            aopp aoppVar = new aopp(aomfVar2, aomfVar);
            while (!arrayDeque.isEmpty()) {
                if (((aomf) arrayDeque.peek()).d() >= aopp.c(eh(aoppVar.d) + 1)) {
                    break;
                } else {
                    aoppVar = new aopp((aomf) arrayDeque.pop(), aoppVar);
                }
            }
            arrayDeque.push(aoppVar);
            return;
        }
        if (aomfVar instanceof aopp) {
            aopp aoppVar2 = (aopp) aomfVar;
            int[] iArr = aopp.a;
            cH(aoppVar2.e, arrayDeque);
            cH(aoppVar2.f, arrayDeque);
            return;
        }
        String valueOf = String.valueOf(aomfVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    static final void cI(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                cI(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                cI(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(cG(aomf.z((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof aomf) {
            sb.append(": \"");
            sb.append(cG((aomf) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof aonm) {
            sb.append(" {");
            cJ((aonm) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i4 = i + 2;
            cI(sb, i4, "key", entry.getKey());
            cI(sb, i4, "value", entry.getValue());
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(obj.toString());
    }

    public static void cJ(aooy aooyVar, StringBuilder sb, int i) {
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : aooyVar.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    cI(sb, i, ei(concat), aonm.invokeOrDie(method2, aooyVar, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    cI(sb, i, ei(concat2), aonm.invokeOrDie(method3, aooyVar, new Object[0]));
                }
            }
            String valueOf5 = String.valueOf(substring);
            if (((Method) hashMap2.get(valueOf5.length() != 0 ? "set".concat(valueOf5) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf6 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf6.length() != 0 ? "get".concat(valueOf6) : new String("get"))) {
                    }
                }
                String valueOf7 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf8 = String.valueOf(substring.substring(1));
                String concat3 = valueOf8.length() != 0 ? valueOf7.concat(valueOf8) : new String(valueOf7);
                String valueOf9 = String.valueOf(substring);
                Method method4 = (Method) hashMap.get(valueOf9.length() != 0 ? "get".concat(valueOf9) : new String("get"));
                String valueOf10 = String.valueOf(substring);
                Method method5 = (Method) hashMap.get(valueOf10.length() != 0 ? "has".concat(valueOf10) : new String("has"));
                if (method4 != null) {
                    Object invokeOrDie = aonm.invokeOrDie(method4, aooyVar, new Object[0]);
                    if (method5 == null) {
                        if (invokeOrDie instanceof Boolean) {
                            if (((Boolean) invokeOrDie).booleanValue()) {
                                cI(sb, i, ei(concat3), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof Integer) {
                            if (((Integer) invokeOrDie).intValue() != 0) {
                                cI(sb, i, ei(concat3), invokeOrDie);
                            }
                        } else if (invokeOrDie instanceof Float) {
                            if (((Float) invokeOrDie).floatValue() != 0.0f) {
                                cI(sb, i, ei(concat3), invokeOrDie);
                            }
                        } else if (!(invokeOrDie instanceof Double)) {
                            if (invokeOrDie instanceof String) {
                                equals = invokeOrDie.equals("");
                            } else if (invokeOrDie instanceof aomf) {
                                equals = invokeOrDie.equals(aomf.b);
                            } else if (invokeOrDie instanceof aooy) {
                                if (invokeOrDie != ((aooy) invokeOrDie).getDefaultInstanceForType()) {
                                    cI(sb, i, ei(concat3), invokeOrDie);
                                }
                            } else {
                                if ((invokeOrDie instanceof Enum) && ((Enum) invokeOrDie).ordinal() == 0) {
                                }
                                cI(sb, i, ei(concat3), invokeOrDie);
                            }
                            if (!equals) {
                                cI(sb, i, ei(concat3), invokeOrDie);
                            }
                        } else if (((Double) invokeOrDie).doubleValue() != 0.0d) {
                            cI(sb, i, ei(concat3), invokeOrDie);
                        }
                    } else if (((Boolean) aonm.invokeOrDie(method5, aooyVar, new Object[0])).booleanValue()) {
                        cI(sb, i, ei(concat3), invokeOrDie);
                    }
                }
            }
        }
        if (aooyVar instanceof aonh) {
            Iterator e = ((aonh) aooyVar).l.e();
            while (e.hasNext()) {
                Map.Entry entry = (Map.Entry) e.next();
                int i2 = ((aonj) entry.getKey()).b;
                StringBuilder sb2 = new StringBuilder(13);
                sb2.append("[");
                sb2.append(i2);
                sb2.append("]");
                cI(sb, i, sb2.toString(), entry.getValue());
            }
        }
        aoqc aoqcVar = ((aonm) aooyVar).unknownFields;
        if (aoqcVar != null) {
            for (int i3 = 0; i3 < aoqcVar.b; i3++) {
                cI(sb, i, String.valueOf(aoqp.a(aoqcVar.c[i3])), aoqcVar.d[i3]);
            }
        }
    }

    public static int cK(aonh aonhVar) {
        aopy aopyVar = aonhVar.l.b;
        int a2 = aopyVar.a();
        if (a2 != 1) {
            StringBuilder sb = new StringBuilder("Expected only one extension, saw ");
            sb.append(a2);
            if (a2 != 0) {
                sb.append(": ");
                int a3 = aopyVar.a() < 3 ? aopyVar.a() : 3;
                for (int i = 0; i < a3; i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(((aonj) aopyVar.f(i).getKey()).b);
                }
                if (a2 > 3) {
                    sb.append("...");
                }
            }
            throw new IllegalStateException(sb.toString());
        }
        return ((aonj) aopyVar.f(0).getKey()).b;
    }

    public static int cL(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int cM(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int cN(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int cO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int cP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int cQ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int cR(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int cS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static String cT(int i) {
        return Integer.toString(i - 1);
    }

    public static /* synthetic */ void cU(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static int cV(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public static int cW(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int cX(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int cY(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int cZ(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int ca(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int cb(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
            case 7:
            case 106:
            default:
                return 0;
            case 5:
                return 6;
            case 6:
                return 7;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            case 90:
                return 91;
            case 91:
                return 92;
            case 92:
                return 93;
            case 93:
                return 94;
            case 94:
                return 95;
            case 95:
                return 96;
            case 96:
                return 97;
            case 97:
                return 98;
            case 98:
                return 99;
            case 99:
                return 100;
            case 100:
                return 101;
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            case 107:
                return 108;
            case 108:
                return 109;
            case 109:
                return 110;
            case 110:
                return 111;
            case 111:
                return 112;
            case 112:
                return 113;
            case 113:
                return 114;
            case 114:
                return 115;
            case 115:
                return 116;
            case 116:
                return 117;
            case 117:
                return 118;
            case 118:
                return 119;
            case 119:
                return 120;
            case 120:
                return 121;
            case 121:
                return 122;
            case 122:
                return R.styleable.AppCompatTheme_windowFixedWidthMinor;
            case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                return R.styleable.AppCompatTheme_windowMinWidthMajor;
            case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                return R.styleable.AppCompatTheme_windowMinWidthMinor;
            case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                return R.styleable.AppCompatTheme_windowNoTitle;
            case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                return 127;
            case 127:
                return 128;
            case 128:
                return 129;
            case 129:
                return 130;
            case 130:
                return 131;
            case 131:
                return 132;
            case 132:
                return 133;
            case 133:
                return 134;
            case 134:
                return 135;
            case 135:
                return 136;
            case 136:
                return 137;
            case 137:
                return 138;
            case 138:
                return 139;
            case 139:
                return 140;
            case 140:
                return 141;
            case 141:
                return 142;
            case 142:
                return 143;
            case 143:
                return 144;
            case 144:
                return 145;
            case 145:
                return 146;
            case 146:
                return 147;
            case 147:
                return 148;
            case 148:
                return 149;
            case 149:
                return 150;
            case 150:
                return 151;
            case 151:
                return 152;
            case 152:
                return 153;
            case 153:
                return 154;
            case 154:
                return 155;
            case 155:
                return 156;
            case 156:
                return 157;
            case 157:
                return 158;
            case 158:
                return 159;
            case 159:
                return 160;
            case 160:
                return 161;
            case 161:
                return 162;
            case 162:
                return 163;
            case 163:
                return 164;
            case 164:
                return 165;
            case 165:
                return 166;
            case 166:
                return 167;
            case 167:
                return 168;
            case 168:
                return 169;
            case 169:
                return 170;
            case 170:
                return 171;
            case 171:
                return 172;
            case 172:
                return 173;
            case 173:
                return 174;
            case 174:
                return 175;
            case 175:
                return 176;
            case 176:
                return 177;
            case 177:
                return 178;
            case 178:
                return 179;
            case 179:
                return 180;
            case 180:
                return 181;
        }
    }

    public static int cc(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int cd(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int ce(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 11;
            default:
                return 0;
        }
    }

    public static aoqa cf(anev anevVar) {
        return cg(anevVar.a());
    }

    public static aoqa cg(Instant instant) {
        return aora.e(instant.getEpochSecond(), instant.getNano());
    }

    public static aooy ch(Parcel parcel, aooy aooyVar, aomw aomwVar) {
        return ci(Build.VERSION.SDK_INT >= 23 ? (ProtoParsers$InternalDontUse) parcel.readTypedObject(ProtoParsers$InternalDontUse.CREATOR) : (ProtoParsers$InternalDontUse) parcel.readParcelable(ProtoParsers$InternalDontUse.class.getClassLoader()), aooyVar, aomwVar);
    }

    public static aooy ci(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, aooy aooyVar, aomw aomwVar) {
        return protoParsers$InternalDontUse.b(aooyVar.getDefaultInstanceForType(), aomwVar);
    }

    public static aooy cj(Bundle bundle, String str, aooy aooyVar, aomw aomwVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return ci(protoParsers$InternalDontUse, aooyVar, aomwVar);
    }

    public static aooy ck(Bundle bundle, String str, aooy aooyVar, aomw aomwVar) {
        try {
            return cj(bundle, str, aooyVar, aomwVar);
        } catch (aoob e) {
            throw new RuntimeException(e);
        }
    }

    public static ProtoParsers$ParcelableProto cl(aooy aooyVar) {
        return new ProtoParsers$InternalDontUse(null, aooyVar);
    }

    public static void cm(Parcel parcel, aooy aooyVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            parcel.writeTypedObject(new ProtoParsers$InternalDontUse(null, aooyVar), 0);
        } else {
            parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, aooyVar), 0);
        }
    }

    public static void cn(Bundle bundle, String str, aooy aooyVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, aooyVar));
        bundle.putParcelable(str, bundle2);
    }

    public static final String co(ByteBuffer byteBuffer, int i, int i2) {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = byteBuffer.get(i);
            if (!cw(b)) {
                break;
            }
            i++;
            ct(b, cArr, i4);
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = byteBuffer.get(i);
            if (cw(b2)) {
                int i7 = i5 + 1;
                ct(b2, cArr, i5);
                i = i6;
                while (true) {
                    i5 = i7;
                    if (i < i3) {
                        byte b3 = byteBuffer.get(i);
                        if (!cw(b3)) {
                            break;
                        }
                        i++;
                        i7 = i5 + 1;
                        ct(b3, cArr, i5);
                    }
                }
            } else if (cy(b2)) {
                if (i6 < i3) {
                    cv(b2, byteBuffer.get(i6), cArr, i5);
                    i = i6 + 1;
                    i5++;
                } else {
                    throw aoob.d();
                }
            } else if (cx(b2)) {
                if (i6 < i3 - 1) {
                    int i8 = i6 + 1;
                    cu(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                    i = i8 + 1;
                    i5++;
                } else {
                    throw aoob.d();
                }
            } else if (i6 < i3 - 2) {
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                cs(b2, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                i5 += 2;
                i = i10 + 1;
            } else {
                throw aoob.d();
            }
        }
        return new String(cArr, 0, i5);
    }

    public static String cp(byte[] bArr, int i, int i2) {
        int length = bArr.length;
        if ((i | i2 | ((length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (!cw(b)) {
                break;
            }
            i++;
            ct(b, cArr, i4);
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (cw(b2)) {
                int i6 = i4 + 1;
                ct(b2, cArr, i4);
                i = i5;
                while (true) {
                    i4 = i6;
                    if (i < i3) {
                        byte b3 = bArr[i];
                        if (!cw(b3)) {
                            break;
                        }
                        i++;
                        i6 = i4 + 1;
                        ct(b3, cArr, i4);
                    }
                }
            } else if (cy(b2)) {
                if (i5 < i3) {
                    cv(b2, bArr[i5], cArr, i4);
                    i = i5 + 1;
                    i4++;
                } else {
                    throw aoob.d();
                }
            } else if (cx(b2)) {
                if (i5 < i3 - 1) {
                    int i7 = i5 + 1;
                    cu(b2, bArr[i5], bArr[i7], cArr, i4);
                    i = i7 + 1;
                    i4++;
                } else {
                    throw aoob.d();
                }
            } else if (i5 < i3 - 2) {
                int i8 = i5 + 1;
                int i9 = i8 + 1;
                cs(b2, bArr[i5], bArr[i8], bArr[i9], cArr, i4);
                i4 += 2;
                i = i9 + 1;
            } else {
                throw aoob.d();
            }
        }
        return new String(cArr, 0, i4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0083, code lost:
    
        if (r12[r13] <= (-65)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int cq(int r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amkq.cq(int, byte[], int, int):int");
    }

    public static final boolean cr(byte[] bArr, int i, int i2) {
        return cq(0, bArr, i, i2) == 0;
    }

    public static void cs(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (eg(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || eg(b3) || eg(b4)) {
            throw aoob.d();
        }
        int ef = ((b & 7) << 18) | (ef(b2) << 12) | (ef(b3) << 6) | ef(b4);
        cArr[i] = (char) ((ef >>> 10) + 55232);
        cArr[i + 1] = (char) ((ef & 1023) + 56320);
    }

    public static void ct(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    public static void cv(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || eg(b2)) {
            throw aoob.d();
        }
        cArr[i] = (char) (((b & 31) << 6) | ef(b2));
    }

    public static boolean cw(byte b) {
        return b >= 0;
    }

    public static boolean cx(byte b) {
        return b < -16;
    }

    public static boolean cy(byte b) {
        return b < -32;
    }

    public static String d(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (f(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (f(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static int dA(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            default:
                return 0;
        }
    }

    public static int dB(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int dC(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                return 0;
        }
    }

    public static int dD(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dE(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int dF(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static int dG(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dH(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dI(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dJ(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int dK(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dL(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            default:
                return 0;
        }
    }

    public static int dM(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int dN(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dP(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dQ(int i) {
        if (i != 0) {
            return i != 1 ? 0 : 2;
        }
        return 1;
    }

    public static int dR(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    public static int dS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dT(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dU(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dV(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static /* synthetic */ String dW(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "HANDOFF_ACTION_STATE_CANCELED" : "HANDOFF_ACTION_STATE_ACCEPTED" : "HANDOFF_ACTION_STATE_FINISHED" : "HANDOFF_ACTION_STATE_PENDING" : "HANDOFF_ACTION_STATE_UNKNOWN";
    }

    public static int dX(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dY(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    private static int dZ(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static int da(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int db(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dc(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dd(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int de(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int df(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            default:
                return 0;
        }
    }

    public static int dg(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dh(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int di(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            default:
                return 0;
        }
    }

    public static int dj(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dk(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dl(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 4) {
            return 5;
        }
        if (i != 8) {
            return i != 16 ? 0 : 17;
        }
        return 9;
    }

    public static int dm(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dn(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: do, reason: not valid java name */
    public static int m1do(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dp(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dq(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 4;
        }
        return 3;
    }

    public static int dr(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int ds(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dt(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 201) {
            return 202;
        }
        if (i == 281) {
            return 282;
        }
        if (i == 282) {
            return 283;
        }
        switch (i) {
            case 101:
                return 102;
            case 102:
                return 103;
            case 103:
                return 104;
            case 104:
                return 105;
            case 105:
                return 106;
            default:
                switch (i) {
                    case 301:
                        return 302;
                    case 302:
                        return 303;
                    case 303:
                        return 304;
                    case 304:
                        return 305;
                    case 305:
                        return 306;
                    case 306:
                        return 307;
                    case 307:
                        return 308;
                    default:
                        return 0;
                }
        }
    }

    public static int du(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            default:
                return 0;
        }
    }

    public static int dv(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            default:
                return 0;
        }
    }

    public static int dw(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }

    public static int dx(int i) {
        if (i == 0) {
            return 1;
        }
        if (i != 1) {
            return i != 2 ? 0 : 3;
        }
        return 2;
    }

    public static int dy(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case 32:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case 64:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            case 80:
                return 81;
            case 81:
                return 82;
            case 82:
                return 83;
            case 83:
                return 84;
            case 84:
                return 85;
            case 85:
                return 86;
            case 86:
                return 87;
            case 87:
                return 88;
            case 88:
                return 89;
            case 89:
                return 90;
            default:
                return 0;
        }
    }

    public static int dz(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 100) {
            return 101;
        }
        if (i == 200) {
            return 201;
        }
        if (i == 300) {
            return 301;
        }
        if (i != 400) {
            return i != 500 ? 0 : 501;
        }
        return 401;
    }

    public static boolean e(CharSequence charSequence, CharSequence charSequence2) {
        int dZ;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence2.charAt(i);
            if (charAt != charAt2 && ((dZ = dZ(charAt)) >= 26 || dZ != dZ(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static String ea(int i, int i2, String str) {
        if (i < 0) {
            return z("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    private static Object eb(List list) {
        return list.get(list.size() - 1);
    }

    private static Collection ec(Iterable iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return aQ(iterable.iterator());
    }

    private static void ed(List list, ammy ammyVar, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (ammyVar.a(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            } else {
                list.remove(i2);
            }
        }
    }

    private static void ee(List list, ammy ammyVar) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!ammyVar.a(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        ed(list, ammyVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        ed(list, ammyVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    private static int ef(byte b) {
        return b & 63;
    }

    private static boolean eg(byte b) {
        return b > -65;
    }

    private static final int eh(int i) {
        int binarySearch = Arrays.binarySearch(aopp.a, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    private static final String ei(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static boolean f(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean g(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static void h(Context context) {
        ((amkc) alta.t(context, amkc.class)).jX();
    }

    public static void i(Context context) {
        ((amkc) alta.t(context, amkc.class)).jX();
    }

    public static amkb j(Iterable iterable) {
        return new amkb(anaf.H(iterable));
    }

    public static anhy k(anhy anhyVar, Class cls, anfz anfzVar, Executor executor) {
        return aney.i(anhyVar, cls, amjk.c(anfzVar), executor);
    }

    public static anhy l(Callable callable, Executor executor) {
        return anaf.S(amjk.g(callable), executor);
    }

    public static anhy m(anhy anhyVar, amml ammlVar, Executor executor) {
        return anfq.h(anhyVar, amjk.a(ammlVar), executor);
    }

    public static anhy n(anhy anhyVar, anfz anfzVar, Executor executor) {
        return anfq.i(anhyVar, amjk.c(anfzVar), executor);
    }

    public static void o(anhy anhyVar, anhh anhhVar, Executor executor) {
        anaf.Y(anhyVar, amjk.e(anhhVar), executor);
    }

    public static amiu p(Context context) {
        return ((amiw) axfq.n(context, amiw.class)).kc();
    }

    public static amkq q() {
        return new amkq();
    }

    public static void r(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        }
        if (obj2 != null) {
            return;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 26);
        sb2.append("null value in entry: ");
        sb2.append(valueOf2);
        sb2.append("=null");
        throw new NullPointerException(sb2.toString());
    }

    public static void s(boolean z) {
        O(z, "no calls to next() since the last call to remove()");
    }

    public static void t(int i, String str) {
        if (i >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 40);
        sb.append(str);
        sb.append(" cannot be negative but was: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static Object u(Object obj) {
        Object[] objArr = new Object[0];
        if (obj != null) {
            return obj;
        }
        throw new amod(z("expected a non-null reference", objArr));
    }

    public static void v(boolean z) {
        if (!z) {
            throw new amod();
        }
    }

    public static void w(boolean z, String str, Object obj) {
        if (!z) {
            throw new amod(z(str, obj));
        }
    }

    public static amnv x(amnv amnvVar) {
        if ((amnvVar instanceof amnx) || (amnvVar instanceof amnw)) {
            return amnvVar;
        }
        if (amnvVar instanceof Serializable) {
            return new amnw(amnvVar);
        }
        return new amnx(amnvVar);
    }

    public static amnv y(Object obj) {
        return new amny(obj);
    }

    public static String z(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String sb3 = sb2.toString();
                    Logger logger = Logger.getLogger("com.google.common.base.Strings");
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(sb3);
                    logger.logp(level, "com.google.common.base.Strings", "lenientToString", valueOf.length() != 0 ? "Exception during lenientFormat for ".concat(valueOf) : new String("Exception during lenientFormat for "), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(sb3).length() + 9 + String.valueOf(name2).length());
                    sb4.append("<");
                    sb4.append(sb3);
                    sb4.append(" threw ");
                    sb4.append(name2);
                    sb4.append(">");
                    sb = sb4.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb5 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb5.append((CharSequence) str, i3, indexOf);
            sb5.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb5.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb5.append(" [");
            sb5.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb5.append(", ");
                sb5.append(objArr[i4]);
            }
            sb5.append(']');
        }
        return sb5.toString();
    }

    public final boolean cz(Object obj, aopl aoplVar) {
        int d = aoplVar.d();
        int a2 = aoqp.a(d);
        int b = aoqp.b(d);
        if (b == 0) {
            cB(obj, a2, aoplVar.l());
            return true;
        }
        if (b == 1) {
            ((aoqc) obj).f(aoqp.c(a2, 1), Long.valueOf(aoplVar.k()));
            return true;
        }
        if (b == 2) {
            cA(obj, a2, aoplVar.q());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                return false;
            }
            if (b == 5) {
                ((aoqc) obj).f(aoqp.c(a2, 5), Integer.valueOf(aoplVar.f()));
                return true;
            }
            throw aoob.a();
        }
        int c = aoqp.c(a2, 4);
        aoqc c2 = aoqc.c();
        while (aoplVar.c() != Integer.MAX_VALUE && cz(c2, aoplVar)) {
        }
        if (c == aoplVar.d()) {
            c2.e();
            ((aoqc) obj).f(aoqp.c(a2, 3), c2);
            return true;
        }
        throw aoob.b();
    }

    public static void cu(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!eg(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!eg(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | (ef(b2) << 6) | ef(b3));
                return;
            }
        }
        throw aoob.d();
    }
}
