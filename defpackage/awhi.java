package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhi extends aonm implements aooz {
    public static final awhi a;
    private static volatile aopf f;
    public int b;
    public aqyg d;
    public awhl e;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private awhk k;
    private byte l = 2;
    public String c = "";

    static {
        awhi awhiVar = new awhi();
        a = awhiVar;
        aonm.registerDefaultInstance(awhi.class, awhiVar);
    }

    private awhi() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\u0005", new Object[]{"b", "c", "g", "d", "h", "i", "e", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new awhi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awhi.class) {
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
