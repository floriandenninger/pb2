package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpl extends aonm implements aooz {
    public static final avpl a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private apmh h;
    private apmh i;
    private apmh j;
    private aota k;
    private byte l = 2;

    static {
        avpl avplVar = new avpl();
        a = avplVar;
        aonm.registerDefaultInstance(avpl.class, avplVar);
    }

    private avpl() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\b\u0007ᐉ\u000b\nᐉ\u0003\fᐉ\n\rᐉ\t", new Object[]{"c", "d", "e", "f", "h", "k", "g", "j", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new avpl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpl.class) {
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
