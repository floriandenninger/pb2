package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancv extends aonm implements aooz {
    public static final int ADDITIONAL_AHARDWAREBUFFER_USAGE_FIELD_NUMBER = 6;
    public static final int BACK_RGB16_WITH_BGR16_FIELD_NUMBER = 7;
    public static final int BLACK_BOOST_FIELD_NUMBER = 3;
    public static final int COMPOSITOR_DRAWS_FLANGE_FIELD_NUMBER = 8;
    public static final ancv DEFAULT_INSTANCE;
    public static final int DISPLAY_LATENCY_MICROS_FIELD_NUMBER = 2;
    public static final int FLAGS_FIELD_NUMBER = 1;
    private static volatile aopf PARSER = null;
    public static final int SCANOUT_OFFSET_MICROS_FIELD_NUMBER = 9;
    public static final int SCHEDULING_SLACK_MICROS_FIELD_NUMBER = 10;
    public static final int STRIPS_PER_FRAME_FIELD_NUMBER = 5;
    public static final int VSYNC_GRACE_PERIOD_MICROS_FIELD_NUMBER = 4;
    private long additionalAhardwarebufferUsage_;
    private boolean backRgb16WithBgr16_;
    public int bitField0_;
    private long blackBoost_;
    private boolean compositorDrawsFlange_;
    private long displayLatencyMicros_;
    public long flags_;
    private long scanoutOffsetMicros_;
    private long schedulingSlackMicros_;
    private long stripsPerFrame_;
    private long vsyncGracePeriodMicros_;

    static {
        ancv ancvVar = new ancv();
        DEFAULT_INSTANCE = ancvVar;
        aonm.registerDefaultInstance(ancv.class, ancvVar);
    }

    private ancv() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဇ\u0006\bဇ\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "flags_", "displayLatencyMicros_", "blackBoost_", "vsyncGracePeriodMicros_", "stripsPerFrame_", "additionalAhardwarebufferUsage_", "backRgb16WithBgr16_", "compositorDrawsFlange_", "scanoutOffsetMicros_", "schedulingSlackMicros_"});
            case NEW_MUTABLE_INSTANCE:
                return new ancv();
            case NEW_BUILDER:
                return new aone(DEFAULT_INSTANCE);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (ancv.class) {
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
