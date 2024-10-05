package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atcq extends aonm implements aooz {
    public static final atcq a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public arfs d;
    public apmh f;
    private aota i;
    private byte j = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        atcq atcqVar = new atcq();
        a = atcqVar;
        aonm.registerDefaultInstance(atcq.class, atcqVar);
    }

    private atcq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005Л\u0006ᐉ\u0004\u0007ᐉ\u0006\bည\u0007", new Object[]{"b", "c", "d", "e", aqyg.class, "f", "i", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atcq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atcq.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
