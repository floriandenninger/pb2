package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anda extends aonm implements aooz {
    public static final int ALLOW_CASTING_FIELD_NUMBER = 1;
    public static final int ALLOW_SCREENSHOT_FIELD_NUMBER = 3;
    public static final int ALLOW_SCREEN_RECORD_FIELD_NUMBER = 2;
    public static final anda DEFAULT_INSTANCE;
    private static volatile aopf PARSER;
    private boolean allowCasting_;
    private boolean allowScreenRecord_;
    private boolean allowScreenshot_;
    private int bitField0_;

    static {
        anda andaVar = new anda();
        DEFAULT_INSTANCE = andaVar;
        aonm.registerDefaultInstance(anda.class, andaVar);
    }

    private anda() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "allowCasting_", "allowScreenRecord_", "allowScreenshot_"});
            case NEW_MUTABLE_INSTANCE:
                return new anda();
            case NEW_BUILDER:
                return new aone(DEFAULT_INSTANCE);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (anda.class) {
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
