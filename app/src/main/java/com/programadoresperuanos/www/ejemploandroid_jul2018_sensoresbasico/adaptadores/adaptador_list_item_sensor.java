package com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.adaptadores;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.R;
import com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.modelos.sensor_model;

import java.util.List;

public class adaptador_list_item_sensor extends RecyclerView.Adapter<adaptador_list_item_sensor.ViewHolder> {

    String apio;
    private Context contexto;
    private LayoutInflater inflador;
    private List<sensor_model> datos;

    public adaptador_list_item_sensor(Context contexto, List<sensor_model> datos) {
        this.contexto = contexto;
        this.inflador = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.datos = datos;
    }

    @NonNull
    @Override
    public adaptador_list_item_sensor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = inflador.inflate(R.layout.item_list_sensor,parent,false);
        return new adaptador_list_item_sensor.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tv_constante.setText(datos.get(position).getConstante());
        holder.tv_nombre.setText(datos.get(position).getNombre());
        holder.tv_grupo.setText(datos.get(position).getGrupo());
        /*if(datos.get(position).getGrupo().equals("Sensores de movimiento")){
            holder.card.setCardBackgroundColor(contexto.getResources().getColor(R.color.card1));
        }else if(datos.get(position).getGrupo().equals("Sensores de posicion")){
            holder.card.setCardBackgroundColor(contexto.getResources().getColor(R.color.card2));
        }else{
            holder.card.setCardBackgroundColor(contexto.getResources().getColor(R.color.card3));
        }*/
        holder.tv_descripcion.setText(datos.get(position).getDescripcion());
        holder.tv_usos.setText(datos.get(position).getUsos());
        holder.tv_tipo.setText(datos.get(position).getTipo());
        holder.tv_api.setText(datos.get(position).getApi());
        holder.tv_dimensiones.setText(String.valueOf(datos.get(position).getDimensiones()));
        holder.tv_unidadMedida.setText(datos.get(position).getUnidadMedida());
        holder.tv_obsoleto.setText(datos.get(position).isObsoleto()?"obsoleto":"no obsoleto");
        if (datos.get(position).getApiObsoleto() != null){
            apio = datos.get(position).getApiObsoleto();
        }else{
            apio = "Vigente hasta la actualidad.";
        }
        holder.tv_apiObsoleto.setText(apio);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CardView card;
        TextView tv_constante,tv_nombre,tv_grupo,tv_descripcion,tv_usos,tv_tipo,tv_api,tv_dimensiones,tv_unidadMedida,tv_obsoleto,tv_apiObsoleto;

        public ViewHolder(View itemView) {
            super(itemView);
            card = itemView.findViewById(R.id.card);
            tv_constante = itemView.findViewById(R.id.constante);
            tv_nombre = itemView.findViewById(R.id.nombre);
            tv_grupo = itemView.findViewById(R.id.grupo);
            tv_descripcion = itemView.findViewById(R.id.descripcion);
            tv_usos = itemView.findViewById(R.id.usos);
            tv_tipo = itemView.findViewById(R.id.tipo);
            tv_api = itemView.findViewById(R.id.api);
            tv_dimensiones = itemView.findViewById(R.id.dimensiones);
            tv_unidadMedida = itemView.findViewById(R.id.unidadMedida);
            tv_obsoleto = itemView.findViewById(R.id.obsoleto);
            tv_apiObsoleto = itemView.findViewById(R.id.apiObsoleto);
        }
    }
}
