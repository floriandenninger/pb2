package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class owe extends aonm implements aooz {
    public static final owe a;
    private static volatile aopf r;
    public int b;
    public int d;
    public long i;
    public long k;
    public int l;
    public long m;
    public long n;
    public long o;
    public String c = "";
    public String e = "";
    public aony f = emptyProtobufList();
    public aonu g = emptyIntList();
    public aomf h = aomf.b;
    public String j = "";
    public aonx p = emptyLongList();
    public String q = "";

    static {
        owe oweVar = new owe();
        a = oweVar;
        aonm.registerDefaultInstance(owe.class, oweVar);
    }

    private owe() {
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0003\u0000\u0001ဈ\u0000\u0003င\u0002\u0004ဈ\u0003\u0005\u001b\u0006ည\u0004\u0007ဂ\u0005\bဈ\u0006\tဂ\u0007\nင\b\u000bဂ\t\fဂ\n\rဂ\u000b\u000e\u0014\u000fဈ\f\u0010\u0016", new Object[]{"b", "c", "d", "e", "f", owa.class, "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new owe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (owe.class) {
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
