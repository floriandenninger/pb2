package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atio extends aonm implements aooz {
    public static final atio a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private aulq e;
    private aulq f;
    private aulq g;
    private aulq h;
    private aulq i;
    private aulq j;
    private aulq k;
    private byte l = 2;

    static {
        atio atioVar = new atio();
        a = atioVar;
        aonm.registerDefaultInstance(atio.class, atioVar);
    }

    private atio() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0000\b\u0002ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\u0005\u000bᐉ\u0001", new Object[]{"c", "e", "f", "h", "i", "j", "k", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atio();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atio.class) {
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
