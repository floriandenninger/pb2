package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aokd extends aonm implements aooz {
    public static final aokd a;
    private static volatile aopf w;
    public int b;
    public aoki f;
    public long g;
    public aoka i;
    public aokb k;
    public int l;
    public aokc m;
    public aojz o;
    public int q;
    public int s;
    public boolean t;
    public aokn v;
    public String c = "";
    public String d = "";
    public aony e = emptyProtobufList();
    public String h = "";
    public String j = "";
    public String n = "";
    public String p = "";
    public String r = "";
    public String u = "";

    static {
        aokd aokdVar = new aokd();
        a = aokdVar;
        aonm.registerDefaultInstance(aokd.class, aokdVar);
    }

    private aokd() {
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
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0014\u0014\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဉ\u0002\u0005ဂ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\bဈ\u0006\tဉ\u0007\nဌ\b\u000bဉ\t\fဈ\n\rဉ\u000b\u000eဈ\f\u000fင\r\u0010ဈ\u000e\u0011ဌ\u000f\u0012ဇ\u0010\u0013ဈ\u0011\u0014ဉ\u0012", new Object[]{"b", "c", "d", "e", aoki.class, "f", "g", "h", "i", "j", "k", "l", aoib.n, "m", "n", "o", "p", "q", "r", "s", aoib.p, "t", "u", "v"});
            case NEW_MUTABLE_INSTANCE:
                return new aokd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = w;
                if (aopfVar == null) {
                    synchronized (aokd.class) {
                        aopfVar = w;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            w = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
