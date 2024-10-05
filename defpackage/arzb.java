package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzb extends aonm implements aooz {
    public static final arzb a;
    private static volatile aopf j;
    public int b;
    public arnd c;
    public arzc d;
    public arze e;
    public apxf h;
    public String i;
    private apxf k;
    private aulq l;
    private aota m;
    private aqzg n;
    private byte o = 2;
    public aony f = emptyProtobufList();
    public String g = "";

    static {
        arzb arzbVar = new arzb();
        a = arzbVar;
        aonm.registerDefaultInstance(arzb.class, arzbVar);
    }

    private arzb() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        this.i = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001̉\u000b\u0000\u0001\t\u0001ᐉ\u0000\u0003ᐉ\u0002\u0007Л\bဈ\u0007\tᐉ\b\nᐉ\t\rᐉ\u0004\u000eᐉ\n\u0010ᐉ\u000b\u0014ဈ\u000ẻᐉ\r", new Object[]{"b", "c", "d", "f", apxf.class, "g", "h", "k", "e", "l", "m", "i", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new arzb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arzb.class) {
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
