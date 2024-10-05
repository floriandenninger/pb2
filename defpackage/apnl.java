package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apnl extends aonm implements aooz {
    public static final apnl a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private apmh h;
    private apmh i;
    private apmh j;
    private apxf k;
    private aota l;
    private byte m = 2;

    static {
        apnl apnlVar = new apnl();
        a = apnlVar;
        aonm.registerDefaultInstance(apnl.class, apnlVar);
    }

    private apnl() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000f\t\u0000\u0000\t\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bᐉ\n\rᐉ\u000e\u000fᐉ\u0010", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apnl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apnl.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
