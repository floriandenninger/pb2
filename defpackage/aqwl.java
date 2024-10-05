package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqwl extends aonm implements aooz {
    public static final aqwl a;
    private static volatile aopf j;
    public int b;
    public Object d;
    public apxf h;
    public aqwm i;
    public int c = 0;
    private byte k = 2;
    public String e = "";
    public aony f = emptyProtobufList();
    public String g = "";

    static {
        aqwl aqwlVar = new aqwl();
        a = aqwlVar;
        aonm.registerDefaultInstance(aqwl.class, aqwlVar);
    }

    private aqwl() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0001\u0001\n\u0007\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဉ\u0006\u0004Л\u0005ဈ\u0002\u0007ဵ\u0000\bဵ\u0000\nᐉ\u0005", new Object[]{"d", "c", "b", "e", "i", "f", apxf.class, "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqwl();
            case NEW_BUILDER:
                return new aone((float[][]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqwl.class) {
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
