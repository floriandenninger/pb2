package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkt extends aonm implements aooz {
    public static final tkt a;
    private static volatile aopf r;
    public int b;
    public int e;
    public int f;
    public awzo h;
    public int j;
    public awzo k;
    public int m;
    public int n;
    public aols q;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";
    public aony l = emptyProtobufList();
    public String o = "";
    public String p = "";

    static {
        tkt tktVar = new tkt();
        a = tktVar;
        aonm.registerDefaultInstance(tkt.class, tktVar);
    }

    private tkt() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0015\u000f\u0000\u0001\u0000\u0002ဈ\u0001\u0004င\u0002\u0005ဈ\u0004\u0007ဈ\u0000\u000bဉ\u0005\fဉ\b\r\u001b\u000eဈ\u0006\u000fဌ\u0003\u0010င\u0007\u0011ဌ\t\u0012ဌ\n\u0013ဈ\u000b\u0014ဈ\f\u0015ဉ\r", new Object[]{"b", "d", "e", "g", "c", "h", "k", "l", tkw.class, "i", "f", sgo.m, "j", "m", sgo.l, "n", sgo.k, "o", "p", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new tkt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (tkt.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
