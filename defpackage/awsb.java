package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsb extends aonm implements aooz {
    public static final awsb a;
    private static volatile aopf h;
    public int b;
    public aoqa d;
    public int e;
    public awsc g;
    private aoot i = aoot.a;
    public String c = "";
    public String f = "";

    static {
        awsb awsbVar = new awsb();
        a = awsbVar;
        aonm.registerDefaultInstance(awsb.class, awsbVar);
    }

    private awsb() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u00052\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", awnx.m, "f", "i", awsa.a, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awsb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awsb.class) {
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
