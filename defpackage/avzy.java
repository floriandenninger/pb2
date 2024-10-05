package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzy extends aonm implements aooz {
    public static final avzy a;
    private static volatile aopf b;
    private int c;
    private awaa d;
    private aqyg e;
    private aqyg f;
    private avzz g;
    private awab h;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private apxf l;
    private aota m;
    private byte n = 2;

    static {
        avzy avzyVar = new avzy();
        a = avzyVar;
        aonm.registerDefaultInstance(avzy.class, avzyVar);
    }

    private avzy() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\f\fᐉ\t\u000eᐉ\n", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "m", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new avzy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avzy.class) {
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
