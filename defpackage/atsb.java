package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsb extends aonm implements aooz {
    public static final atsb a;
    private static volatile aopf j;
    public int b;
    public boolean c;
    public atsa d;
    public atrz g;
    private aota k;
    private byte l = 2;
    public aony e = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        atsb atsbVar = new atsb();
        a = atsbVar;
        aonm.registerDefaultInstance(atsb.class, atsbVar);
    }

    private atsb() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0003\u0006\u0001ဇ\u0000\u0002ᐉ\u0003\u0003Л\u0004ည\u0007\u0005ᐉ\u0004\bᐉ\u0006\tЛ\u000bЛ", new Object[]{"b", "c", "d", "e", atrw.class, "i", "g", "k", "h", apxf.class, "f", atry.class});
            case NEW_MUTABLE_INSTANCE:
                return new atsb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (atsb.class) {
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
