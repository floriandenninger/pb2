package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ario extends aonm implements aooz {
    public static final ario a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public arnb e;
    public int f;
    public aony g;
    public arin h;
    private apxf j;
    public int c = 0;
    private byte k = 2;

    static {
        ario arioVar = new ario();
        a = arioVar;
        aonm.registerDefaultInstance(ario.class, arioVar);
    }

    private ario() {
        aomf aomfVar = aomf.b;
        this.g = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\u0012\b\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ဌ\u0001\u0004Л\u0005ᐉ\u0004\fြ\u0000\rျ\u0000\u000eျ\u0000\u0012ဉ\r", new Object[]{"d", "c", "b", "e", "f", argn.j, "g", aovq.class, "j", aqjn.class, "h"});
            case NEW_MUTABLE_INSTANCE:
                return new ario();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ario.class) {
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
