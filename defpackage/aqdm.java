package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdm extends aonm implements aooz {
    public static final aqdm a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public String d = "";
    public String e = "";
    public int f;
    public boolean g;

    static {
        aqdm aqdmVar = new aqdm();
        a = aqdmVar;
        aonm.registerDefaultInstance(aqdm.class, aqdmVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aqdmVar, aqdmVar, null, 279698363, aoqn.MESSAGE, aqdm.class);
    }

    private aqdm() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqdm.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
