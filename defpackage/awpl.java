package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpl extends aonh implements aoni {
    public static final awpl a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awpk e;
    private byte g = 2;
    public String d = "";

    static {
        awpl awplVar = new awpl();
        a = awplVar;
        aonm.registerDefaultInstance(awpl.class, awplVar);
        b = aonm.newSingularGeneratedExtension(awpr.a, awplVar, awplVar, null, 255496645, aoqn.MESSAGE, awpl.class);
    }

    private awpl() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awpl();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awpl.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
