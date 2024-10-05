package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzf extends aonm implements aooz {
    public static final arzf a;
    private static volatile aopf i;
    public int b;
    public arnb c;
    public int g;
    private byte j = 2;
    public String d = "";
    public aony e = aonm.emptyProtobufList();
    public String f = "";
    public String h = "";

    static {
        arzf arzfVar = new arzf();
        a = arzfVar;
        aonm.registerDefaultInstance(arzf.class, arzfVar);
    }

    private arzf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0002\u0003\u001a\u0004ဌ\u0004\u0006ဈ\u0003\u0007ဈ\u0006", new Object[]{"b", "c", "d", "e", "g", aufb.d, "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arzf();
            case NEW_BUILDER:
                return new aone((int[][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (arzf.class) {
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
