c	class PatientImpl {
	public int Create(String LastName, String FirstName ) {
		return createCall.execute(LastName, FirstName);
	}
	
	public boolean Delete(int Id ) {
		return deleteCall.execute(Id);
	}
	
	private CreateImpl createCall;
	private DeleteImpl deleteCall;
}
// Actifsource ID=[931b162c-8c67-11df-a65f-fd4c167633ca,41121bc5-8c67-11df-a65f-fd4c167633ca]
