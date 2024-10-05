package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqhh extends aonm implements aooz {
    public static final aqhh a;
    private static volatile aopf n;
    public int b;
    public avgg c;
    public aqhf d;
    public aqhg f;
    public boolean g;
    public boolean h;
    public apxf i;
    public apxf j;
    public aott k;
    public aott l;
    public aqyg m;
    private aqyg o;
    private byte p = 2;
    public String e = "";

    static {
        aqhh aqhhVar = new aqhh();
        a = aqhhVar;
        aonm.registerDefaultInstance(aqhh.class, aqhhVar);
    }

    private aqhh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0006\u0001ᐉ\u0000\u0003ဉ\u0002\u0004ဈ\u0004\u0005ဇ\u0007\u0006ဇ\b\u0007ᐉ\t\bᐉ\n\tဉ\u000b\nဉ\f\fᐉ\u0006\u000eᐉ\r\u000fᐉ\u000e", new Object[]{"b", "c", "d", "e", "g", "h", "i", "j", "k", "l", "f", "m", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new aqhh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (aqhh.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
