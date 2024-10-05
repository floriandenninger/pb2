package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awef extends aonm implements aooz {
    public static final awef a;
    private static volatile aopf b;
    private int c;
    private apxf d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private apxf k;
    private aulq l;
    private awee m;
    private aota n;
    private byte o = 2;

    static {
        awef awefVar = new awef();
        a = awefVar;
        aonm.registerDefaultInstance(awef.class, awefVar);
    }

    private awef() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0002\u000f\u000b\u0000\u0000\u000b\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0007ᐉ\b\bᐉ\n\nᐉ\u000e\u000bᐉ\u0006\fᐉ\t\rᐉ\u0000\u000fᐉ\u000b", new Object[]{"c", "e", "f", "g", "h", "j", "l", "n", "i", "k", "d", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new awef();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awef.class) {
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
