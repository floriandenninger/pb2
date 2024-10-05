package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdm extends aonm implements aooz {
    public static final tdm a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public String d = "";
    public int e = -1;
    public int f = -1;

    static {
        tdm tdmVar = new tdm();
        a = tdmVar;
        aonm.registerDefaultInstance(tdm.class, tdmVar);
    }

    private tdm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"b", "c", "d", "e", sgo.d, "f", sgo.d});
            case NEW_MUTABLE_INSTANCE:
                return new tdm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (tdm.class) {
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
