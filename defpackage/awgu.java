package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awgu extends aonm implements aooz {
    public static final awgu a;
    private static volatile aopf d;
    public int b;
    public awgo c;
    private awgr e;
    private byte f = 2;

    static {
        awgu awguVar = new awgu();
        a = awguVar;
        aonm.registerDefaultInstance(awgu.class, awguVar);
    }

    private awgu() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001連ᬜ\uf8f0ᶅ\u0002\u0000\u0000\u0002連ᬜᐉ\u0000\uf8f0ᶅᐉ\u0001", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new awgu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awgu.class) {
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
