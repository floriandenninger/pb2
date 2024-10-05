package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qeg extends aonm implements aooz {
    public static final qeg a;
    private static volatile aopf n;
    public int b;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String l = "";
    public String m = "";

    static {
        qeg qegVar = new qeg();
        a = qegVar;
        aonm.registerDefaultInstance(qeg.class, qegVar);
    }

    private qeg() {
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
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bင\u0007\tဌ\b\nဈ\t\fဈ\n", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", dvg.o, "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new qeg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (qeg.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
