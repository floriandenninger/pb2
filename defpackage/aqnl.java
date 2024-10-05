package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnl extends aonm implements aooz {
    public static final aqnl a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    private byte f = 2;
    public String d = "";

    static {
        aqnl aqnlVar = new aqnl();
        a = aqnlVar;
        aonm.registerDefaultInstance(aqnl.class, aqnlVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqnlVar, aqnlVar, null, 380917126, aoqn.MESSAGE, aqnl.class);
    }

    private aqnl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqnl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqnl.class) {
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
