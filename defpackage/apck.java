package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apck extends aonm implements aooz {
    public static final apck a;
    private static volatile aopf m;
    public int b;
    public apcj c;
    public long d;
    public boolean e;
    public boolean f;
    public String g = "";
    public String h = "";
    public boolean i;
    public apcl j;
    public boolean k;
    public long l;

    static {
        apck apckVar = new apck();
        a = apckVar;
        aonm.registerDefaultInstance(apck.class, apckVar);
    }

    private apck() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0012\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0005ဇ\u0004\u0006ဇ\u0005\bဈ\u0007\tဈ\b\u000eဇ\f\u000fဉ\r\u0011ဇ\u000e\u0012ဂ\u000f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apck();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apck.class) {
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
