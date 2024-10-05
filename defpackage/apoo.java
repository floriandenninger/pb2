package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apoo extends aonm implements aooz {
    public static final apoo a;
    private static volatile aopf b;
    private aqyg A;
    private aqyg B;
    private apou C;
    private apxf D;
    private aqyg E;
    private byte F = 2;
    private int c;
    private int d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private apov m;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private aqyg q;
    private aqyg r;
    private aqyg s;
    private apoy t;
    private apow u;
    private apox v;
    private apos w;
    private apxf x;
    private aqyg y;
    private apop z;

    static {
        apoo apooVar = new apoo();
        a = apooVar;
        aonm.registerDefaultInstance(apoo.class, apooVar);
    }

    private apoo() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.F);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.F = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u001b\u0000\u0002\u0001)\u001b\u0000\u0000\u001b\u0001ᐉ\u0004\u0004ᐉ\u000e\u0005ᐉ\u000f\u0006ᐉ\u0010\u0007ᐉ\u0012\bᐉ\u0013\tᐉ\u0014\nᐉ\u0015\fᐉ\u0016\u0012ᐉ\u001f\u0013ᐉ\u0000\u0015ᐉ\n\u0016ᐉ\u000b\u0018ᐉ\u001b\u0019ᐉ\u001c\u001aᐉ\u0003\u001bᐉ\u0018\u001cᐉ\f\u001dᐉ\r\u001eᐉ\t\u001fᐉ\u0006 ᐉ\u0005%ᐉ\u0007&ᐉ\u001d'ᐉ (ᐉ!)ᐉ\u0011", new Object[]{"c", "d", "g", "p", "q", "r", "t", "u", "v", "w", "x", "C", "e", "l", "m", "z", "A", "f", "y", "n", "o", "k", "i", "h", "j", "B", "D", "E", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new apoo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apoo.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
