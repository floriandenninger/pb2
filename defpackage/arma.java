package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arma extends aonm implements aooz {
    public static final arma a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public arnb e;
    public long i;
    public long j;
    public auec k;
    public int c = 0;
    private byte m = 2;
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        arma armaVar = new arma();
        a = armaVar;
        aonm.registerDefaultInstance(arma.class, armaVar);
    }

    private arma() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0001\u0001\u0001\u0014\u0010\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0007ြ\u0000\bြ\u0000\tြ\u0000\nြ\u0000\fဈ\u0005\rြ\u0000\u000eြ\u0000\u000fြ\u0000\u0010ဂ\u000f\u0011ဂ\u0010\u0012ြ\u0000\u0013ဉ\u0011\u0014ြ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", arlr.class, arlp.class, arlm.class, arln.class, "h", arlo.class, arll.class, arlq.class, "i", "j", aueh.class, "k", auen.class});
            case NEW_MUTABLE_INSTANCE:
                return new arma();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (arma.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
