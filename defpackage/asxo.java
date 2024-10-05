package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxo extends aonm implements aooz {
    public static final asxo a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public String d = "";
    public String e;
    public long f;

    static {
        asxo asxoVar = new asxo();
        a = asxoVar;
        aonm.registerDefaultInstance(asxo.class, asxoVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, asxoVar, asxoVar, null, 262, aoqn.MESSAGE, asxo.class);
    }

    private asxo() {
        aomf aomfVar = aomf.b;
        this.e = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဃ\u0003", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asxo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asxo.class) {
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
