package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsu extends aonm implements aooz {
    public static final atsu a;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public atsw e;
    public boolean f;
    public apxf g;
    public aony h;
    private apxf j;
    private aota k;
    private byte l = 2;
    public aony d = emptyProtobufList();

    static {
        atsu atsuVar = new atsu();
        a = atsuVar;
        aonm.registerDefaultInstance(atsu.class, atsuVar);
    }

    private atsu() {
        emptyProtobufList();
        this.h = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0005ᐉ\t\bЛ\tᐉ\u0003\nဇ\u0004\fᐉ\u0005\rᐉ\u0006\u000fЛ", new Object[]{"b", "c", "k", "d", atss.class, "e", "f", "g", "j", "h", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new atsu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (atsu.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
