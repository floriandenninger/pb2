package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atse extends aonm implements aooz {
    public static final aonv a = new atpn(2);
    public static final atse b;
    private static volatile aopf s;
    public int c;
    public long f;
    public long h;
    public long i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public apdt p;
    public boolean r;
    private int t;
    public aomf d = aomf.b;
    public aomf e = aomf.b;
    public String g = "";
    public aonu q = emptyIntList();

    static {
        atse atseVar = new atse();
        b = atseVar;
        aonm.registerDefaultInstance(atse.class, atseVar);
    }

    private atse() {
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
                return newMessageInfo(b, "\u0001\u000f\u0000\u0002\u0001\"\u000f\u0000\u0001\u0000\u0001ည\u0000\u0002ဂ\u0002\u0003ည\u0001\u0005ဈ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\u000bဇ\n\u000eင\r\u000fင\u000e\u0010င\u000f\u0013င\u0012\u0019င\u0018\u001bဉ\u001a ,\"ဇ ", new Object[]{"c", "t", "d", "f", "e", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", apue.a(), "r"});
            case NEW_MUTABLE_INSTANCE:
                return new atse();
            case NEW_BUILDER:
                return new aone(b);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (atse.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
