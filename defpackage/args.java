package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class args extends aonm implements aooz {
    public static final args a;
    private static volatile aopf d;
    public int b;
    public argx c;
    private arhh e;
    private byte f = 2;

    static {
        args argsVar = new args();
        a = argsVar;
        aonm.registerDefaultInstance(args.class, argsVar);
    }

    private args() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\ue8f7ᵷ\ue646㘁\u0002\u0000\u0000\u0002\ue8f7ᵷᐉ\u0000\ue646㘁ᐉ\u0001", new Object[]{"b", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new args();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (args.class) {
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
