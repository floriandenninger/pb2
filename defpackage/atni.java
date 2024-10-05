package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atni extends aonm implements aooz {
    public static final atni a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aqyg d;
    public int f;
    private aota i;
    private byte j = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        atni atniVar = new atni();
        a = atniVar;
        aonm.registerDefaultInstance(atni.class, atniVar);
    }

    private atni() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0003\u0004ည\u0004\u0005ᐉ\u0001\u0006ဌ\u0002", new Object[]{"b", "c", "e", apmh.class, "i", "g", "d", "f", aqkw.a});
            case NEW_MUTABLE_INSTANCE:
                return new atni();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atni.class) {
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
