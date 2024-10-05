package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arwn extends aonm implements aooz {
    public static final arwn a;
    private static volatile aopf j;
    public int b;
    public arnd c;
    public apmh e;
    public arwh f;
    public long h;
    private aota k;
    private aqzg l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public String g = "";
    public aomf i = aomf.b;

    static {
        arwn arwnVar = new arwn();
        a = arwnVar;
        aonm.registerDefaultInstance(arwn.class, arwnVar);
    }

    private arwn() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001̉\t\u0000\u0001\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0006ဈ\u0004\u0007ᐉ\u0002\tဂ\u0005\nᐉ\u0006\u000bည\u0007̉ᐉ\b", new Object[]{"b", "c", "d", apxf.class, "e", "g", "f", "h", "k", "i", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new arwn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arwn.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
