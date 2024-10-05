package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzr extends aonm implements aooz {
    public static final qzr a;
    private static volatile aopf o;
    public int b;
    public int c;
    public int h;
    public int j;
    public int l;
    public int m;
    public boolean n;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long i = -1;
    public String k = "";

    static {
        qzr qzrVar = new qzr();
        a = qzrVar;
        aonm.registerDefaultInstance(qzr.class, qzrVar);
    }

    private qzr() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"b", "c", "d", "e", "g", "i", "j", "h", awwu.n, "k", "f", "l", "m", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new qzr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (qzr.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
