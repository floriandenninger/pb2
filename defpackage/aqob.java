package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqob extends aonm implements aooz {
    public static final aqob a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    private byte i = 2;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";

    static {
        aqob aqobVar = new aqob();
        a = aqobVar;
        aonm.registerDefaultInstance(aqob.class, aqobVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqobVar, aqobVar, null, 378762193, aoqn.MESSAGE, aqob.class);
    }

    private aqob() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0000\u0000\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqob();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqob.class) {
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
