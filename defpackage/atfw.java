package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfw extends aonm implements aooz {
    public static final atfw a;
    private static volatile aopf k;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public int f;
    public avgg g;
    public aqyg j;
    private byte l = 2;
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();

    static {
        atfw atfwVar = new atfw();
        a = atfwVar;
        aonm.registerDefaultInstance(atfw.class, atfwVar);
    }

    private atfw() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005Л\u0006Л\u0007ဌ\u0003\bᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "h", apmh.class, "i", auyv.class, "f", aufb.d, "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atfw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atfw.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
