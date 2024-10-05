package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqud extends aonm implements aooz {
    public static final aqud a;
    private static volatile aopf c;
    public aoot b = aoot.a;

    static {
        aqud aqudVar = new aqud();
        a = aqudVar;
        aonm.registerDefaultInstance(aqud.class, aqudVar);
    }

    private aqud() {
    }

    public final boolean a(String str) {
        return this.b.containsKey(str);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", aquc.a});
            case NEW_MUTABLE_INSTANCE:
                return new aqud();
            case NEW_BUILDER:
                return new aone((byte[]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aqud.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
