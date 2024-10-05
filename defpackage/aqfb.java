package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfb extends aonm implements aooz {
    public static final aqfb a;
    private static volatile aopf b;
    private int c;
    private aota d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private apmh i;
    private apmh j;
    private byte k = 2;

    static {
        aqfb aqfbVar = new aqfb();
        a = aqfbVar;
        aonm.registerDefaultInstance(aqfb.class, aqfbVar);
    }

    private aqfb() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\t\u000bᐉ\u0005", new Object[]{"c", "d", "e", "f", "h", "i", "j", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfb.class) {
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
