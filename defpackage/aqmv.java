package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqmv extends aonm implements aooz {
    public static final aqmv a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    private awqj f;
    private awqj g;
    private byte h = 2;
    public String d = "";

    static {
        aqmv aqmvVar = new aqmv();
        a = aqmvVar;
        aonm.registerDefaultInstance(aqmv.class, aqmvVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqmvVar, aqmvVar, null, 353892150, aoqn.MESSAGE, aqmv.class);
    }

    private aqmv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u000e\u0003\u0000\u0000\u0002\u0002ဈ\u000f\rᐉ\u0006\u000eᐉ\u0007", new Object[]{"c", "d", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqmv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqmv.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
