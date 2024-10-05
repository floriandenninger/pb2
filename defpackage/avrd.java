package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avrd extends aonm implements aooz {
    public static final avrd a;
    private static volatile aopf b;
    private int c;
    private auzj d;
    private aqpz e;
    private byte f = 2;

    static {
        avrd avrdVar = new avrd();
        a = avrdVar;
        aonm.registerDefaultInstance(avrd.class, avrdVar);
    }

    private avrd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue2d9ᩭ\uf470㧛\u0002\u0000\u0000\u0002\ue2d9ᩭᐉ\u0000\uf470㧛ᐉ\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avrd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avrd.class) {
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
