package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aokh extends aonm implements aooz {
    public static final aokh a;
    private static volatile aopf p;
    public Object c;
    public long e;
    public aokv f;
    public long h;
    public long i;
    public aols k;
    public long m;
    public int n;
    public aoky o;
    private int q;
    public int b = 0;
    public String d = "";
    public aony g = emptyProtobufList();
    public String j = "";
    public String l = "";

    static {
        aokh aokhVar = new aokh();
        a = aokhVar;
        aonm.registerDefaultInstance(aokh.class, aokhVar);
    }

    private aokh() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0005\u0018\u0010\u0000\u0001\u0000\u0005\u001b\bဂ\b\tဂ\t\nဈ\u0001\fြ\u0000\rြ\u0000\u000eဉ\u000f\u000fဉ\u0005\u0010ဈ\u0010\u0011ြ\u0000\u0012ြ\u0000\u0014ဂ\u0011\u0015ဌ\u0012\u0016ဈ\u000e\u0017ဂ\u0004\u0018ဉ\u0013", new Object[]{"c", "b", "q", "g", aokg.class, "h", "i", "d", aokd.class, aokl.class, "k", "f", "l", aokx.class, aokj.class, "m", "n", aokr.b, "j", "e", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aokh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aokh.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
