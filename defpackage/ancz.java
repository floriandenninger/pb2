package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancz extends aonm implements aooz {
    public static final ancz DEFAULT_INSTANCE;
    private static volatile aopf PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private String version_ = "";

    static {
        ancz anczVar = new ancz();
        DEFAULT_INSTANCE = anczVar;
        aonm.registerDefaultInstance(ancz.class, anczVar);
    }

    private ancz() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "version_"});
            case NEW_MUTABLE_INSTANCE:
                return new ancz();
            case NEW_BUILDER:
                return new aone(DEFAULT_INSTANCE);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (ancz.class) {
                        aopfVar = PARSER;
                        if (aopfVar == null) {
                            aopfVar = new aonf(DEFAULT_INSTANCE);
                            PARSER = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
