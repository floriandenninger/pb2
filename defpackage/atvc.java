package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvc extends aonm implements aooz {
    public static final atvc a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aqyg d;
    public atva e;
    public atva f;
    public apxf h;
    public aqyg i;
    private atvb k;
    private byte l = 2;
    public aony g = emptyProtobufList();

    static {
        atvc atvcVar = new atvc();
        a = atvcVar;
        aonm.registerDefaultInstance(atvc.class, atvcVar);
    }

    private atvc() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005\bЛ\tᐉ\u0006\nᐉ\u0007\u000bᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g", atvd.class, "h", "i", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new atvc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atvc.class) {
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
