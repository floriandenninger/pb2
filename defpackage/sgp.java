package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgp extends aonm implements aooz {
    public static final sgp a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public long d;
    public int e;
    public boolean f;
    public boolean g;

    static {
        sgp sgpVar = new sgp();
        a = sgpVar;
        aonm.registerDefaultInstance(sgp.class, sgpVar);
    }

    private sgp() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0004ဌ\u0003\u0006ဇ\u0005\bဇ\u0007", new Object[]{"b", "c", "d", "e", sgo.a, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new sgp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (sgp.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
