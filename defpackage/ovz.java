package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovz extends aonm implements aooz {
    public static final ovz a;
    private static volatile aopf m;
    public int b;
    public long f;
    public long h;
    public int i;
    public boolean k;
    public int l;
    public String c = "";
    public String d = "";
    public aomf e = aomf.b;
    public String g = "";
    public String j = "";

    static {
        ovz ovzVar = new ovz();
        a = ovzVar;
        aonm.registerDefaultInstance(ovz.class, ovzVar);
    }

    private ovz() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007င\u0006\bဈ\u0007\tဇ\b\nဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", aqjm.a()});
            case NEW_MUTABLE_INSTANCE:
                return new ovz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ovz.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
