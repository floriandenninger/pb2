package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjp extends aonm implements aooz {
    public static final aqjp a;
    private static volatile aopf b;
    private int c;
    private aqjt d;
    private aqjr e;
    private aota f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aulq k;
    private byte l = 2;

    static {
        aqjp aqjpVar = new aqjp();
        a = aqjpVar;
        aonm.registerDefaultInstance(aqjp.class, aqjpVar);
    }

    private aqjp() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000e\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\tᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\n\u000eᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqjp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqjp.class) {
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
