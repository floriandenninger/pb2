package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxk extends aonm implements aooz {
    public static final asxk a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public String d = "";
    public aony e;
    public String f;

    static {
        asxk asxkVar = new asxk();
        a = asxkVar;
        aonm.registerDefaultInstance(asxk.class, asxkVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, asxkVar, asxkVar, null, 136, aoqn.MESSAGE, asxk.class);
    }

    private asxk() {
        aomf aomfVar = aomf.b;
        this.e = emptyProtobufList();
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0003\u001b\u0004ဈ\u0002", new Object[]{"c", "d", "e", asxj.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asxk();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asxk.class) {
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
