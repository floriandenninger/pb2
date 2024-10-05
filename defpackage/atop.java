package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atop extends aonm implements aooz {
    public static final atop a;
    private static volatile aopf k;
    public aqyg b;
    public aqyg c;
    public apxf f;
    public int h;
    public avgg i;
    public atdf j;
    private int l;
    private byte m = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public String g = "";

    static {
        atop atopVar = new atop();
        a = atopVar;
        aonm.registerDefaultInstance(atop.class, atopVar);
    }

    private atop() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0004Л\u0005ᐉ\u0002\u0007ဈ\u0003\bဌ\u0004\tᐉ\u0005\nᐉ\u0006", new Object[]{"l", "b", "c", "d", aqyg.class, "e", avgg.class, "f", "g", "h", apld.i, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new atop();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (atop.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
