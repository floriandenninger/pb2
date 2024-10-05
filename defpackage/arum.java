package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arum extends aonm implements aooz {
    public static final arum a;
    private static volatile aopf d;
    public int b;
    public asra c;
    private atdn e;
    private byte f = 2;

    static {
        arum arumVar = new arum();
        a = arumVar;
        aonm.registerDefaultInstance(arum.class, arumVar);
    }

    private arum() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue592᯦\ue55b㟮\u0002\u0000\u0000\u0002\ue592᯦ᐉ\u0001\ue55b㟮ᐉ\u0000", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new arum();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arum.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
