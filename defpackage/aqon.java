package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqon extends aonm implements aooz {
    public static final aqon a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public aqom e;
    public int f;
    private byte h = 2;
    public String d = "";

    static {
        aqon aqonVar = new aqon();
        a = aqonVar;
        aonm.registerDefaultInstance(aqon.class, aqonVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqonVar, aqonVar, null, 297019532, aoqn.MESSAGE, aqon.class);
    }

    private aqon() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\t\u0003\u0000\u0000\u0000\u0002ဈ\u0002\u0006ဉ\u0006\tင\u0007", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqon();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqon.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
