package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avfx extends aonm implements aooz {
    public static final avfx a;
    private static volatile aopf g;
    public int b;
    public arfs c;
    public aqyg d;
    public int e;
    public int f;
    private byte h = 2;

    static {
        avfx avfxVar = new avfx();
        a = avfxVar;
        aonm.registerDefaultInstance(avfx.class, avfxVar);
    }

    private avfx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ᐉ\u0001\u0002ဌ\u0002\u0003ဌ\u0003\u0004ᐉ\u0000", new Object[]{"b", "d", "e", avcl.q, "f", avcl.o, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avfx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avfx.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
