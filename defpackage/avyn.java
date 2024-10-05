package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyn extends aonm implements aooz {
    public static final avyn a;
    private static volatile aopf b;
    private aota A;
    private avyl B;
    private avyp C;
    private atdf D;
    private apxf E;
    private byte F = 2;
    private int c;
    private int d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private avyq h;
    private auzs i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private avyo q;
    private aqyg r;
    private apkd s;
    private apkd t;
    private apkk u;
    private asnj v;
    private apmn w;
    private avym x;
    private aulq y;
    private aulq z;

    static {
        avyn avynVar = new avyn();
        a = avynVar;
        aonm.registerDefaultInstance(avyn.class, avynVar);
    }

    private avyn() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u001b\u0000\u0002\u0001/\u001b\u0000\u0000\u001b\u0001ᐉ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\n\nᐉ\f\fᐉ\u000e\u0010ᐉ\u0013\u0017ᐉ\u0011\u0018ᐉ\u001a\u001bᐉ\u000b ᐉ\"!ᐉ\u0004\"ᐉ#%ᐉ$&ᐉ%'ᐉ\u001b(ᐉ\u0015)ᐉ\u0016*ᐉ\u001c+ᐉ\u0017,ᐉ .ᐉ\u001d/ᐉ\u001e", new Object[]{"c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "o", "p", "r", "q", "v", "n", "B", "h", "C", "D", "E", "w", "s", "t", "x", "u", "A", "y", "z"});
            case NEW_MUTABLE_INSTANCE:
                return new avyn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avyn.class) {
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
